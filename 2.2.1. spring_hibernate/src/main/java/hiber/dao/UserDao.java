package hiber.dao;

import hiber.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao {
   void add(User user);
   List<User> listUsers();
}
