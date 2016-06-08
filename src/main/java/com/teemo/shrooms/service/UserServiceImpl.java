package com.teemo.shrooms.service;

import com.teemo.shrooms.dso.User;
import com.teemo.shrooms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserRepository> implements UserService{

    @Autowired
    public UserServiceImpl(UserRepository repository){
        super(repository);
    }

    public List<User> getUserByUserName(String userName){
        return getRepository().findByUserName(userName);
    }
}
