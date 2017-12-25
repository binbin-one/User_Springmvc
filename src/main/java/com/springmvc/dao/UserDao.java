package com.springmvc.dao;

import com.springmvc.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiu on 2017/10/31.
 */
@Repository("userDao")
public class UserDao extends BaseDao{

    //添加用户
    public boolean addUser(Users user){
        try {
            getSession().save(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //删除用户
    public boolean deleteUser(Users user){
        try {
            getSession().delete(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //修改用户
    public boolean updateUser(Users user){
        try {
            getSession().update(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //查询单个用户
    public Users selectUserById(Users user){
        return getSession().get(user.getClass(), user.getUno());
    }

    //查询所有用户
    public List selectUser(String hql){
        return getSession().createQuery(hql).list();
    }
}
