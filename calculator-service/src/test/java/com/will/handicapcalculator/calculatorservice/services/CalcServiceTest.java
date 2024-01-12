package com.will.handicapcalculator.calculatorservice.services;

import static com.will.handicapcalculator.calculatorservice.utils.Utils.EXPECTED_HANDICAP;
import static com.will.handicapcalculator.calculatorservice.utils.Utils.createRounds;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(CalcService.class)
public class CalcServiceTest {

  @Autowired
  private CalcService service;

  @Test
  public void calculateHandicap_happyPath(){
  Double actual = service.calculateHandicap(createRounds());
  assertThat(actual).isEqualTo(EXPECTED_HANDICAP);
  }

}