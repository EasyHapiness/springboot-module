package yin.ya.song.service.impl;

import org.springframework.stereotype.Service;
import yin.ya.song.User;
import yin.ya.song.mapper.UserMapper;
import yin.ya.song.service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserByName(long id) {
        return  userMapper.selectByPrimaryKey(id);
    }
    /*@Override
    public User getUserByName(long id) {
        User user = new User();
        user.setRealname("yinyasong");
        return user;
    }*/
}
