package com.example.YouOnWork.API.Service;


import com.example.YouOnWork.API.Model.User;

public final class UserFactory   {

    UserFactory() {
    }


    public User create(String username, String password) {
        return new User(username,password);
    }

}
