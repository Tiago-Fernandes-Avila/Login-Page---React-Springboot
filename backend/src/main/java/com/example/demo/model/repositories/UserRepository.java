package com.example.demo.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities.User;
@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    @Query(nativeQuery = true, value = "SELECT * FROM tb_user u WHERE u.email = :email AND password = :password")
    public User UserByEmailAndPasswordExistsInRepositoryLayer(String email, String password);


}
