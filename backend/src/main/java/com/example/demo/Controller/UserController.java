package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dtos.UserDto;
import com.example.demo.model.service.UserService;

@RestController
@RequestMapping(value = "/")
public class UserController {
    @Autowired
    private UserService serviceLayer;
    @CrossOrigin("/**")
    @PostMapping(value = "login-request")
    public ResponseEntity<String> loginRequest(@RequestParam UserDto body){
       if( serviceLayer.UserByEmailAndPasswordExistsService(body)){
          return ResponseEntity.ok().body("Tudo Certo!");

       }
       else{
        return ResponseEntity.badRequest().body("Error: User doens't exists!");
    }


      
    }
    
}
