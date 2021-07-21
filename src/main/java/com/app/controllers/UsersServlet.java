package com.app.controllers;


import com.app.dao.interfaces.BookDAO;
import com.app.dao.interfaces.UserDAO;
import com.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersServlet {

    private UserDAO userDAO;
    List<User> list = new ArrayList<>();

    //@RequestMapping(value = "/form", method = RequestMethod.GET)
    @GetMapping(value = "/add")
    public String getForm() {
        return "addUser.jsp";
    }

    @PostMapping(value = "/add")
    public String passDataFromUser(@ModelAttribute("user") User user) {

        userDAO.addUser(user);

        return "redirect:/users/all";
    }

    @GetMapping(value = "/all")
    public ModelAndView listAll(ModelAndView modelAndView) {
        modelAndView.addObject("list", userDAO.getAllUsers());
        modelAndView.setViewName("allUsers.jsp");

        return modelAndView;
    }

    @GetMapping(value = "/findUserById")
    private ModelAndView getFindUserById(ModelAndView modelAndView) {
        modelAndView.addObject("index", 1);
        modelAndView.setViewName("findUserById.jsp");
        return modelAndView;
    }

    @PostMapping(value = "/findUserById")
    public ModelAndView findUserById(@RequestParam("id") long id, ModelAndView modelAndView) {
        modelAndView.addObject("index", 1);
        modelAndView.addObject("list", userDAO.getUserById(id));
        modelAndView.setViewName("IdUserResult.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/findUserByEmail")
    private ModelAndView getFindUserByEmail(ModelAndView modelAndView) {
        modelAndView.addObject("index", 2);
        modelAndView.setViewName("findUserById.jsp");
        return modelAndView;

    }

    @PostMapping(value = "/findUserByEmail")
    public ModelAndView findUserByEmail(@RequestParam("email") String email, ModelAndView modelAndView) {
        modelAndView.addObject("index", 2);
        modelAndView.addObject("user", userDAO.getUserByEmail(email));
        modelAndView.setViewName("IdUserResult.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/findUserByLogin")
    private ModelAndView getFindUserByLogin(ModelAndView modelAndView) {
        modelAndView.addObject("index", 3);
        modelAndView.setViewName("findUserById.jsp");
        return modelAndView;

    }

    @PostMapping(value = "/findUserByLogin")
    public ModelAndView findUserByLogin(@RequestParam("login") String login, ModelAndView modelAndView) {
        modelAndView.addObject("index", 3);
        modelAndView.addObject("list", userDAO.getUsersByLogin(login));
        modelAndView.setViewName("IdUserResult.jsp");
        return modelAndView;
    }


    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
