package com.example.YouOnWork.API.Service;

import com.example.YouOnWork.API.Model.JwtUser;


public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(JwtUser user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getPassword()
        );
    }


}
