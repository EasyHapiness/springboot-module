package yin.ya.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yin.ya.song.User;
import yin.ya.song.service.UserService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {


    @Resource
    UserService userService;

    @RequestMapping("/info")
    public Object getUser(){

        return "hello everyBody !";
    }

    @RequestMapping("/name")
    public User getUserByName(long id){

        return userService.getUserByName(id);
    }
}
