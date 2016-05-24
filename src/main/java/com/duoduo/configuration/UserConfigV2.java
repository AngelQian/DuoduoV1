//package com.duoduo.configuration;
//
//import com.duoduo.dao.JpaUserDaoImpl;
//import com.duoduo.dao.UserDao;
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.hibernate.dialect.MySQLDialect;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import javax.sql.DataSource;
//
///**
// * Created by AngelQian on 5/24/16.
// */
//@Configuration
//public class UserConfigV2 {
//
//    /*@Bean
//    public UserDao userDao() {
//        return new HibernateUserDaoImp(sessionfactory().getObject());
//    }
//    @Bean
//    public LocalSessionFactoryBean sessionfactory() {
//        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource());
//        sessionFactoryBean.setConfigLocation(new ClassPathResource("hibernate.cfgV2.xml"));
//        return sessionFactoryBean;
//    }
//    private Properties hibernateProperties() {
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", org.hibernate.dialect.DerbyTenSevenDialect.class.getName());
//        properties.put("hibernate.show_sql", true);
//        properties.put("hibernate.hbm2dll.auto", "update");
//        return properties;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionfactory() {
//        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource());
//        sessionFactoryBean.setPackagesToScan("com.apress.springrecipes.course");
//        sessionFactoryBean.setHibernateProperties(hibernateProperties());
//        return sessionFactoryBean;
//    }*/
//
//    @Bean
//    public UserDao userDao() {
//        return new JpaUserDaoImpl(entityManagerFactory().getObject());
//    }
//
////    @Bean
////    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
////        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
////        emf.setPersistenceUnitName("jpauser");
////        return emf;
////    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
////        emf.setPersistenceUnitName("jpauser");
//        emf.setPackagesToScan("com.duoduo.repositories");
//        emf.setDataSource(dataSource());
//        emf.setJpaVendorAdapter(jpaVendorAdapter());
//        return emf;
//    }
//
//    private JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//        jpaVendorAdapter.setShowSql(true);
//        jpaVendorAdapter.setGenerateDdl(true);
//        jpaVendorAdapter.setDatabasePlatform(MySQLDialect.class.getName());
//        return jpaVendorAdapter;
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/duoduo?autoReconnect=true&useSSL=false");
//        dataSource.setUsername("root");
//        dataSource.setPassword("1111");
//        dataSource.setInitialSize(2);
//        dataSource.setMaxTotal(5);
//        return dataSource;
//    }
//
//}
