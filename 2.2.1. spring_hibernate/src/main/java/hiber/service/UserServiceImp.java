package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


    private UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    public User getUserByModelAndSeries(String model, int series) {
        return userDao.getUserByModelAndSeries(model, series);
    }

}