package com.will.handicapcalculator.calculatorservice.userservice.services;

import com.will.handicapcalculator.calculatorservice.userservice.models.Round;
import com.will.handicapcalculator.calculatorservice.userservice.models.User;
import com.will.handicapcalculator.calculatorservice.userservice.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void createUser(User user){
    user.setRounds(new ArrayList<>());
    userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public void createRound(Round round) {
    Optional<User> user = userRepository.findById(round.getUsername());
    if (user.isPresent()) {
        round.setId(generateId(user.get().getRounds()));
        user.get().getRounds().add(round);
        userRepository.save(user.get());
      }
    }

  private Long generateId(List<Round> round){
    Long id = 1L;
    for (int i = 0; i < round.size(); i++) {
      if(round.get(i).getId() == id){
        id++;
        i = -1;
      }
    }
    return id;
  }

}
