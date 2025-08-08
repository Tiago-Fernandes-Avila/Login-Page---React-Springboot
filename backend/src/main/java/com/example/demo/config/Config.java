package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.model.entities.User;
import com.example.demo.model.repositories.UserRepository;

@Configuration
@Profile("test")
public class Config implements CommandLineRunner{
    @Autowired
    private UserRepository uRepository;

    @Override
    public void run(String... args) throws Exception {
        //Seed in h2 db

        User u1 = new User(null, "Tiago Fernandes", "tiago@gmail.com", "123456");

        User u2 = new User(null, "Felipe avila", "felipe@gmail.com", "123456");


        User u3 = new User(null, "FabianaMiguel", "fabi@gmail.com", "123456");

        User u4 = new User(null, "jose silvera", "jose@gmail.com", "123456");

        uRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
    }





}
