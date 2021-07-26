package com.test;



import com.app.entities.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/app-tests-ctx.xml"})
public class UnitTester {

    @Autowired
    List<User> usersList;
    @Autowired
    @Qualifier(value = "user1")
    User user;

    @Test
    public void testUser() {
        Assert.assertEquals("max@gmail.com", user.getEmail());
    }

    @Test
    public void testUser1() {
        Assert.assertFalse(usersList.isEmpty());
        Assert.assertTrue(usersList.contains(user));
        System.out.println(usersList);
    }



    @Test(timeout = 5L)
    public void testUser2() {
        user.testuser();
    }

    @Test(timeout = 10L)
    public void testUser3() {
        user.testuser();
    }
}


