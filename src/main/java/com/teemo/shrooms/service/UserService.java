package com.teemo.shrooms.service;

import com.teemo.shrooms.dso.User;

import java.util.List;

public interface UserService extends BaseService<User>{
    List<User> getUserByUserName(String userName);
}
