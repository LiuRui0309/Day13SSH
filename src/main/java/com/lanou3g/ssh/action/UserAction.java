package com.lanou3g.ssh.action;

import com.lanou3g.ssh.domain.User;
import com.lanou3g.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/8.
 */
@Controller("userAction")
//该类对象的生命周期不归spring管理,
//每次获取该对象的时候都是一个新的对象
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private String repeatPassword;
    private User user = new User();

    @Resource
    private UserService userService;

    public String register() {
        userService.register(user);
        System.out.println("123456");
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public User getUser() {
        return user;
    }
}

