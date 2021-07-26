package com.app.dao.repositories;

import com.app.entities.Book;
import com.app.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserById(long id);

    User findUserByEmail(String email);

    List<User> findUserByLogin(String login);
}
