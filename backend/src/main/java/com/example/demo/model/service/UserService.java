package com.example.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dtos.UserDto;
import com.example.demo.model.entities.User;
import com.example.demo.model.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Boolean UserByEmailAndPasswordExistsService(UserDto uDto){
       User user = userRepository.UserByEmailAndPasswordExistsInRepositoryLayer(uDto.getEmail(), uDto.getPassword());

       if (user != null) {
        return true;
       }

        
        return false;
    }


}
