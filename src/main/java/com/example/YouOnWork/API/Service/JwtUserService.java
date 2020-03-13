package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.IJwtUserService;
import com.example.YouOnWork.API.Dal.JwtUserRepo;
import com.example.YouOnWork.API.Model.JwtUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserService implements IJwtUserService {

    @Autowired
    private JwtUserRepo jwtUserRepo;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private UserFactory userFactory;

    public JwtUserService(JwtUserRepo jwtUserRepo) {
        this.jwtUserRepo = jwtUserRepo;
        userFactory = new UserFactory();
    }

    public String encodePassword(String password){
        return passwordEncoder().encode(password);
    }


    public JwtUser findByUsername(String username) {

      //  new JwtUser("sam",passwordEncoder().encode("sam"))
        return jwtUserRepo.findByUsername(username) ;
    }

    @Override
    public void save(String username, String password) {

    }



}
