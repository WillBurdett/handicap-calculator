package com.will.handicapcalculator.calculatorservice.controllers;

import static com.will.handicapcalculator.calculatorservice.utils.Utils.EXPECTED_HANDICAP;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.will.handicapcalculator.calculatorservice.services.CalcService;
import com.will.handicapcalculator.calculatorservice.utils.Utils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(CalcController.class)
class CalcControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CalcService service;

  @Test
  void calculateHandicap() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule());

    String json = mapper.writeValueAsString(Utils.createRounds());

        when(service.calculateHandicap(Utils.createRounds())).thenReturn(EXPECTED_HANDICAP);

        this.mockMvc.perform(MockMvcRequestBuilders.post("/calculator-service")
                .contentType(MediaType.APPLICATION_JSON).content(json))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("2.0")));

        verify(service, times(1)).calculateHandicap(Utils.createRounds());

  }
}