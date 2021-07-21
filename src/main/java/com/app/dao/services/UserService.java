package com.app.dao.services;

import com.app.dao.interfaces.UserDAO;
import com.app.dao.repositories.BookRepository;
import com.app.dao.repositories.UserRepository;
import com.app.entities.User;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements UserDAO {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }

    @Override
    public User getUserById(long id) {

        return userRepository.findUserById(id);
    }

    @Override
    public User getUserByEmail(String eamil) {

        return userRepository.findUserByEmail(eamil);
    }

    @Override
    public List<User> getUsersByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }
}
