package com.example.YouOnWork.API.Service.Factory;

import com.example.YouOnWork.API.Model.User;


public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static User create(User user) {
        return new User(
               user.getId(),
                user.getUsername(),
                user.getPassword()
        );
    }

    public static User create(String username, String password) {
        return new User(username,password);
    }
}
