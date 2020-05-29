package com.example.YouOnWork.API.Controller.Interfaces;

public interface IUserService {
    int findUserById(int userId);
    int getUserId(String userName);
}
