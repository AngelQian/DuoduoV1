package com.duoduo.dao;

import com.duoduo.repositories.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by AngelQian on 5/23/16.
 */
public class JpaUserDaoImplV2 implements UserDao {

//    private EntityManagerFactory entityManagerFactory;
//    public JpaUserDaoImpl() {
//        entityManagerFactory = Persistence.createEntityManagerFactory("jpauser");
//    }

    private final EntityManagerFactory entityManagerFactory;
    public JpaUserDaoImplV2(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void store(User user) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        try {
            tx.begin();
            manager.merge(user);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            manager.close();
        }
    }

    @Override
    public void delete(String name) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        try {
            tx.begin();
            User course = manager.find(User.class, name);
            manager.remove(course);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            manager.close();
        }
    }

    @Override
    public User findByName(String name) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        try {
            return manager.find(User.class, name);
        } finally {
            manager.close();
        }
    }

    @Override
    public List<User> findAll() {
        EntityManager manager = entityManagerFactory.createEntityManager();
        try {
            Query query = manager.createQuery("select course from User course");
            return query.getResultList();
        } finally {
            manager.close();
        }
    }
}
