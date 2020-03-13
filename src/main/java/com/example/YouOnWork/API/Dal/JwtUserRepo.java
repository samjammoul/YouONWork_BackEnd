package com.example.YouOnWork.API.Dal;


import com.example.YouOnWork.API.Model.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtUserRepo extends JpaRepository<JwtUser, Long> {

     JwtUser findByUsername(String username);
     JwtUser findByUsernameAndPassword(String username, String password);
}
