package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Controller.Interfaces.IUserService;
import com.example.YouOnWork.API.Dal.UserRepo;
import com.example.YouOnWork.API.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements IUserService {


    private UserRepo userRepo;

    public UserService() {
    }

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public int findUserById(int userId){
        User user = userRepo.findUserById(userId);


        if (user.getId() == 0 || user.getId() < -1 ){
            return 0;
        }else{
            return user.getId();
        }
    }

    public int getUserId(String userName){
       User user = userRepo.findByUsername(userName);
       return user.getId();
    }



        /*
    public void save(String username, String password){
        User user = userFactory.create(username,password);


      //  user.setPassword(jwtUserService.encodePassword(password));
      user.setPassword(passwordEncoder.encode(user.getPassword()));


      System.out.println(user.getPassword());
        userRepo.save(user);
    }
 */

}
