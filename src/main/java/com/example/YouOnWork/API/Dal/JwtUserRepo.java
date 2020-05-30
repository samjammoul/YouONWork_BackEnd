package com.example.YouOnWork.API.Dal;


import com.example.YouOnWork.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtUserRepo extends JpaRepository<User, Integer> {

     User findByUsername(String username);
     User findByUsernameAndPassword(String username, String password);
     User findUserById(int userId);

}
