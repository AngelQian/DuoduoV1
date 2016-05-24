package com.duoduo.dao;

import com.duoduo.repositories.User;

import java.util.List;

/**
 * Created by AngelQian on 5/23/16.
 */
public interface UserDao {
    public void store(User user);
    public void delete(String name);
    public User findByName(String name);
    public List<User> findAll();
}
