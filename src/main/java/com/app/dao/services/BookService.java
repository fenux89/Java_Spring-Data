package com.app.dao.services;


import com.app.dao.interfaces.BookDAO;
import com.app.dao.repositories.BookRepository;
import com.app.entities.Book;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookDAO {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return Lists.newArrayList(bookRepository.findAll());
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getByYear(int year) {
        return bookRepository.findBookByYear(year);
    }

}
