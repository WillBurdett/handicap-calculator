package com.will.handicapcalculator.calculatorservice.userservice.repositories;

import com.will.handicapcalculator.calculatorservice.userservice.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
