package com.will.handicapcalculator.calculatorservice.services;

import com.will.handicapcalculator.calculatorservice.models.Round;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

  public Double calculateHandicap(List<Round> rounds) {

    rounds.sort(Comparator.comparing(Round::getDate));
    List <Round> last20Rounds = rounds.subList(rounds.size() - 20, rounds.size());

    last20Rounds.sort(Comparator.comparing(Round::getScore));
    List <Round> lowest8Rounds = last20Rounds.subList(0, 8);

    Double sum = 0.0;
    for (Round r:
    lowest8Rounds) {
      sum+=r.getScore();
    }

    return sum / 8;
  }
}
