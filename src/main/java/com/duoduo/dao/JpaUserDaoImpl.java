package com.duoduo.dao;

import com.duoduo.repositories.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

/**
 * Created by AngelQian on 5/23/16.
 */

@Repository("userDao")
public class JpaUserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    @Transactional
    public void store(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public void delete(String name) {
        User user = entityManager.find(User.class, name);
        entityManager.remove(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findByName(String name) {
        return entityManager.find(User.class, name);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }
}
