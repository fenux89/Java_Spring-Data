package com.app.controllers;


import com.app.dao.interfaces.BookDAO;

import com.app.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksServlet {
    private BookDAO bookDAO;
    //List<Book> list = new ArrayList<>();

    @GetMapping(value = "/add")
    private String getAddBook() {
        return "addBook.jsp";
    }

    @PostMapping(value = "/add")
    public String addNewBook(@ModelAttribute("book") Book book) {

        //list.add(book);

        bookDAO.addBook(book);

        return "redirect:/books/all";
    }

    @GetMapping(value = "/all")
    public ModelAndView listAllBooks(ModelAndView modelAndView) {

        //modelAndView.addObject("list", list);

        modelAndView.addObject("list", bookDAO.findAll());
        modelAndView.setViewName("allBooks.jsp");
        return modelAndView;
    }


    @GetMapping(value = "/findBookByYear")
    private String getFindBookByYear() {
        return "findBookByYear.jsp";
    }

    @PostMapping(value = "/findBookByYear")
    public ModelAndView findBookByYear(@RequestParam("year") int year, ModelAndView modelAndView) {

        modelAndView.addObject("list", bookDAO.getByYear(year));
        modelAndView.setViewName("yearBookResult.jsp");
        return modelAndView;
    }

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

}