package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.Interfaces.IJwtUserService;
import com.example.YouOnWork.API.Dal.JwtUserRepo;
import com.example.YouOnWork.API.Model.User;

import com.example.YouOnWork.API.Service.Factory.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements IJwtUserService {

    @Autowired
    private JwtUserRepo jwtUserRepo;




    public UserService(){
    }

    public UserService(JwtUserRepo jwtUserRepo) {
        this.jwtUserRepo = jwtUserRepo;

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }





    public String encodePassword(String password){
        return passwordEncoder().encode(password);
    }


    public User findByUsername(String username) {

        new User("sam",passwordEncoder().encode("sam"));
        return jwtUserRepo.findByUsername(username);
    }



    public int findUserById(int userId){
        User user = jwtUserRepo.findUserById(userId);


        if (user.getId() == 0 || user.getId() < -1 ){
            return 0;
        }else{
            return user.getId();
        }
    }

    public int getUserId(String userName){
        User user = jwtUserRepo.findByUsername(userName);
        return user.getId();
    }




    public void addUser(String username, String password){
        User user = JwtUserFactory.create(username,password);


        //  user.setPassword(jwtUserService.encodePassword(password));

           user.setPassword(encodePassword(user.getPassword()));


        System.out.println(user.getPassword());
        jwtUserRepo.save(user);
    }




}
