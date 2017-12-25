package com.springmvc.service;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiu on 2017/10/31.
 */
@Service("userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {

    //注入userDao
    @Resource(name="userDao")
    private UserDao userDao;

    //添加用户
    public boolean addUser(Users user){
        return userDao.addUser(user);
    }

    //删除用户
    public boolean deleteUser(Users user){
        return userDao.deleteUser(user);
    }

    //修改用户
    public boolean updateUser(Users user){
        return userDao.updateUser(user);
    }

    //查询单个用户
    public Users selectUserById(Users user){
        return userDao.selectUserById(user);
    }

    //查询所有用户
    public List selectUser(){
        String hql = "from Users";
        return userDao.selectUser(hql);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
