package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.JwtUser;
import com.example.YouOnWork.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findUserById(int userId);

    User findByUsername(String username);
}
