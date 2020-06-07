package cn.jh.service.Impl;

import cn.jh.dao.UserDao;
import cn.jh.pojo.User;
import cn.jh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username) {
        User user = userDao.queryByUsernameAndPassword(username);
        return user;
    }
}
