package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Dal.JwtUserRepo;
import com.example.YouOnWork.API.Dal.UserRepo;
import com.example.YouOnWork.API.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtUserService jwtUserService;

    @Autowired
    PasswordEncoder passwordEncoder;

    private UserFactory userFactory;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
        this.userFactory = new UserFactory();


    }





    public void save(String username, String password){
        User user = userFactory.create(username,password);
      //  user.setPassword(jwtUserService.encodePassword(password));
      user.setPassword(passwordEncoder.encode(user.getPassword()));
      System.out.println(user.getPassword());
        userRepo.save(user);
    }
}
