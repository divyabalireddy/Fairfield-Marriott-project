package com.onlineHotel.divya.service;



import java.util.List;

import com.onlineHotel.divya.model.User;



public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
