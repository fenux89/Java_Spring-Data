package com.app.dao.repositories;


import com.app.entities.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findBookByYear(int year);

//    @Query("select b from Book b where b.name= :name and b.author= :author")
//    List<Book> getBooksByNameAndAuthor(@Param("name") String name, @Param("author") String author);
}
