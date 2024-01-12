package com.will.handicapcalculator.calculatorservice.utils;

import com.will.handicapcalculator.calculatorservice.models.Round;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {

  public static Double EXPECTED_HANDICAP = 2.0;

  public static List<Round> createRounds() {
    List<Round> list = new ArrayList<>();

    list.add(new Round("bob", 1.0, LocalDate.now()));
    list.add(new Round("bob", 1.0, LocalDate.now()));
    list.add(new Round("bob", 1.0, LocalDate.now()));
    list.add(new Round("bob", 1.0, LocalDate.now()));

    list.add(new Round("bob", 3.0, LocalDate.now()));
    list.add(new Round("bob", 3.0, LocalDate.now()));
    list.add(new Round("bob", 3.0, LocalDate.now()));
    list.add(new Round("bob", 3.0, LocalDate.now()));

    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));
    list.add(new Round("bob", 1000000.0, LocalDate.now()));

    list.add(new Round("bob", -2000000.0, LocalDate.now().minusDays(1)));
    list.add(new Round("bob", -2000000.0, LocalDate.now().minusDays(1)));
    list.add(new Round("bob", -2000000.0, LocalDate.now().minusDays(1)));
    list.add(new Round("bob", -2000000.0, LocalDate.now().minusDays(1)));
    list.add(new Round("bob", -2000000.0, LocalDate.now().minusDays(1)));

    return  list;
  }

}
