package com.example.YouOnWork.API.Dal;

import com.example.YouOnWork.API.Model.JwtUser;
import com.example.YouOnWork.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
