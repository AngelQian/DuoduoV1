package com.duoduo.configuration;

import com.duoduo.dao.JpaUserDaoImpl;
import com.duoduo.dao.UserDao;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by AngelQian on 5/24/16.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.duoduo.repositories")
public class UserConfig {

    @Bean
    public UserDao userDao() {
        return new JpaUserDaoImpl();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
////        emf.setPersistenceUnitName("jpauser");
        emf.setPackagesToScan("com.duoduo.repositories");
        emf.setDataSource(dataSource());
        emf.setJpaVendorAdapter(jpaVendorAdapter());
        return emf;
    }

    private JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setDatabasePlatform(MySQLDialect.class.getName());
        return jpaVendorAdapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory().getObject());
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/duoduo?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("1111");
        dataSource.setInitialSize(2);
        dataSource.setMaxTotal(5);
        return dataSource;
    }

}
