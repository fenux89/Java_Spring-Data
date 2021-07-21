package com.app.dao.interfaces;

import com.app.entities.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    User getUserByEmail(String email);

    List<User> getUsersByLogin(String login);
}
