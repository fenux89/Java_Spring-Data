package com.app.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String email;
    private String password;
    private String login;

    public User() {
    }

    public User(String email, String password, String login) {
        this.email = email;
        this.password = password;
        this.login = login;
    }

    public void testuser (){
        long s=0;
        for (int i = 0; i < 1000000; i++) {
            s+=i*3+i;
        }
    }
}
