//package com.duoduo.configuration;
//
///**
// * Created by AngelQian on 5/23/16.
// */
//
//import com.duoduo.dao.EntityDao;
//import com.duoduo.dao.JdbcEntityDaoImp;
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class EntityConfiguration {
////    @Bean
////    public EntityDao testDao() {
////        return new JdbcEntityDaoImp(dataSource());
////    }
//
//    @Bean
//    public EntityDao entityDao() {
//        return new JdbcEntityDaoImp(jdbcTemplate());
//    }
//    @Bean
//    public JdbcTemplate jdbcTemplate() {
//        return new JdbcTemplate(dataSource());
//    }
//
////    @Bean
////    public DataSource dataSource() {
////        DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
////        dataSource.setUrl("jdbc:mysql://localhost:3306/duoduo?autoReconnect=true&useSSL=false");
////        //jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false
////        dataSource.setUsername("root");
////        dataSource.setPassword("1111");
////        return dataSource;
////    }
//
//    @Bean
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/duoduo?autoReconnect=true&useSSL=false");
//    dataSource.setUsername("root");
//        dataSource.setPassword("1111");
//        dataSource.setInitialSize(2);
//        dataSource.setMaxTotal(5);
//        return dataSource;
//    }
//}
