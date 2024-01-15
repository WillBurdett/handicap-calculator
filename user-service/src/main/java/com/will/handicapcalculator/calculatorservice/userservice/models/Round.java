package com.will.handicapcalculator.calculatorservice.userservice.models;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Round {
  private Long id;
  private String username;
  private Double score;
  private LocalDateTime date;

  public Round(String username, Double score, LocalDateTime date) {
    this.username = username;
    this.score = score;
    this.date = date;
  }
}
