package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public interface Users {
    User findByUsername(String username);

    void update(User user);

    Long insert(User user);

    void delete(long user);

    void edit(User user);

}
