package com.will.handicapcalculator.calculatorservice.userservice.controllers;

import com.will.handicapcalculator.calculatorservice.userservice.models.Round;
import com.will.handicapcalculator.calculatorservice.userservice.models.User;
import com.will.handicapcalculator.calculatorservice.userservice.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user-service")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @PostMapping(path = "/user")
  public void createUser(@RequestBody User user){
    userService.createUser(user);
  }

  @PostMapping(path = "/round")
  public void saveRound(@RequestBody Round round){
    userService.createRound(round);
  }

}
