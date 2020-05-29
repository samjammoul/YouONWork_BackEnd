package com.example.YouOnWork.API.Service.Factory;


import com.example.YouOnWork.API.Model.User;

public final class UserFactory   {

    public UserFactory() {
    }


    public User create(String username, String password) {
        return new User(username,password);
    }

}
