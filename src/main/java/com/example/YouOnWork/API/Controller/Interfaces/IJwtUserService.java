package com.example.YouOnWork.API.Controller.Interfaces;



public interface IJwtUserService {

    int findUserById(int userId);
    int getUserId(String userName);
    void addUser(String userName, String password);
}
