package com.duoduo;

import com.duoduo.configuration.UserConfig;
import com.duoduo.dao.UserDao;
import com.duoduo.repositories.User;
import com.duoduo.repositories.UserRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DuoduotaobaosupportApplication {

    public static void main(String[] args) {
/*
//		SpringApplication.run(DuoduotaobaosupportApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(EntityConfiguration.class);
        EntityDao vehicleDao = context.getBean(EntityDao.class);
//		Entity vehicle = new Entity(Util.convertUUIDtoString(UUID.randomUUID()), "Red", "black");
//		vehicleDao.insert(vehicle);
//		Entity vehicle2 = vehicleDao.findByEntityNo("fc669bca06fd434aa7ab553042db4b22");
//		System.out.println("=============="+vehicle2.getMsg());

        for (Entity et : vehicleDao.findAll()) {
            System.out.println(et.getId() + "==============" + et.getMsg());
        }

        String t = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println("t---" + t);
*/
//        UserDao userDao = new HibernateUserDaoImp();
//        User user = new User();
//        user.setUname("bob2");
//        user.setUpwd("12342");
//        user.setUemail("qian11223@126.com");
//        user.setUqq("3083138902");
//        user.setUword("happy 34");
//        userDao.store(user);

//        UserDao userDao = new JpaUserDaoImpl();
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        UserRepository repository = context.getBean(UserRepository.class);

        UserDao userDao = context.getBean(UserDao.class);
        Iterable<User> users = repository.findAll();//userDao.findAll();
        for (User et : users) {
            System.out.println(et.getUid() + "==============" + et.getUname());
        }
//
//        System.out.println("delete by name");
//        userDao.delete("eac7e4d7e16344febd9734bab2a308dc");
    }
}
