package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.addUser(new User("User1", "Lastname1", "user1@mail.ru", new Car("car1", 1)));
        userService.addUser(new User("User2", "Lastname2", "user2@mail.ru", new Car("car2", 2)));
        userService.addUser(new User("User3", "Lastname3", "user3@mail.ru", new Car("car3", 3)));
        userService.addUser(new User("User4", "Lastname4", "user4@mail.ru", new Car("car4", 4)));


        System.out.println(userService.getUserByModelAndSeries("car2", 2));

        context.close();
    }
}
