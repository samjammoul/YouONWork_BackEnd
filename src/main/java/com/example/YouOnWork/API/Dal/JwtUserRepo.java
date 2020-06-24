package com.example.YouOnWork.API.Dal;


import com.example.YouOnWork.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface JwtUserRepo extends JpaRepository<User, Integer> {

     User findByUsername(@Param("username") String username);
     User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
     User findUserById ( @Param("userId") int userId);

}
