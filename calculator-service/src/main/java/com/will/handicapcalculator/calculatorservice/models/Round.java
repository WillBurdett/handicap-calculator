package com.will.handicapcalculator.calculatorservice.models;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Round {
  private String username;
  private Double score;
  private LocalDate date;
}
