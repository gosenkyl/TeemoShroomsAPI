package com.teemo.shrooms.resource;

import com.teemo.shrooms.dso.User;
import com.teemo.shrooms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "api/users", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable String id){
        return userService.findById(id);
    }

    @RequestMapping(value = "user/{userName}", method = RequestMethod.GET)
    public List<User> getUserByUserName(@PathVariable String userName){
        return userService.getUserByUserName(userName);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User createOrUpdateEntity(@RequestBody User entity) {
        entity.setLastPolled(new Date());

        return userService.save(entity);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteEntity(@PathVariable String id) {
        userService.delete(id);
    }

}
