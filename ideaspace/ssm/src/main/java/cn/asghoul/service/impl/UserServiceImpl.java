package cn.asghoul.service.impl;

import cn.asghoul.dao.UserDao;
import cn.asghoul.pojo.User;
import cn.asghoul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public List<User> selectUser(Map<String,Object> map) {
        return userDao.selectUser(map);
    }
}
/*
*
* 添加评论
* 给我 用户id 订单id 看评论状态
* **/