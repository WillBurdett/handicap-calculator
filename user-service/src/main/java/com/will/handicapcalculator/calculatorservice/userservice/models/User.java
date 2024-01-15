package com.will.handicapcalculator.calculatorservice.userservice.models;

import com.mongodb.lang.NonNull;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  private String email;
  private String password;
  private List<Round> rounds;

  public User(String email, String password) {
    this.email = email;
    this.password = password;
  }
}
