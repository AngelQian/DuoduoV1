package com.duoduo.dao;

import com.duoduo.repositories.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by AngelQian on 5/23/16.
 */
public class HibernateUserDaoImp implements UserDao {

    private SessionFactory sessionFactory;
    public HibernateUserDaoImp() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    @Override
    public void store(User user) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.saveOrUpdate(user);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(String name) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            User user = (User) session.get(User.class, name);
            session.delete(user);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public User findByName(String name) {
        Session session = sessionFactory.openSession();
        try {
            return (User) session.get(User.class, name);
        } finally {
            session.close();
        }
    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.openSession();
        try {
            Query query = session.createQuery("from User");
            return query.list();
        } finally {
            session.close();
        }
    }
}
