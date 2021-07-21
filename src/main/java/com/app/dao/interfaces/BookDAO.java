package com.app.dao.interfaces;


import com.app.entities.Book;

import java.util.List;

public interface BookDAO {
    List<Book> findAll();

    Book addBook(Book book);

    List<Book> getByYear(int year);
}
