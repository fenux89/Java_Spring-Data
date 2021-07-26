package com.test;


import com.app.dao.repositories.UserRepository;
import com.app.dao.services.UserService;
import com.app.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

public class DaoTest {
    @Mock
    UserRepository userRepository;


    @InjectMocks
    UserService userService;


    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("g@mail.com", "879", "admin"));
        userList.add(new User("gjj@mail.com", "441", "admin7"));


    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void test1() throws InterruptedException {
        when(userRepository.findAll()).thenReturn(userList);
        Assert.assertEquals(userList, userService.getAllUsers());

        System.out.println(userService.getAllUsers());
    }

    @Test
    public void test2() {
        when(userRepository.findUserByLogin("admin")).
                thenReturn(userList.stream().filter(elem -> elem.getLogin().equals("admin"))
                        .collect(Collectors.toList()));

        System.out.println(userService.getUsersByLogin("admin"));
    }
}
