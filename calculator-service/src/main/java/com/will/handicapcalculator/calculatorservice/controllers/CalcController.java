package com.will.handicapcalculator.calculatorservice.controllers;

import com.will.handicapcalculator.calculatorservice.models.Round;
import com.will.handicapcalculator.calculatorservice.services.CalcService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator-service")
public class CalcController {

  @Autowired
  private CalcService CalcService;

  public CalcController(CalcService CalcService) {
    this.CalcService = CalcService;
  }

  @PostMapping
  public Double calculateHandicap(@RequestBody List<Round> rounds){
    return CalcService.calculateHandicap(rounds);
  }
}
