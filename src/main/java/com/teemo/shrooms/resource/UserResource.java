package com.teemo.shrooms.resource;

import com.teemo.shrooms.dso.User;
import com.teemo.shrooms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("api/users")
@CrossOrigin
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public User getUserById(@PathVariable String id){
        return userService.findById(id);
    }

    @RequestMapping(value = "user/{userName}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> getUserByUserName(@PathVariable String userName){
        return userService.getUserByUserName(userName);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public User createEntity(User entity) {
        return userService.save(entity);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> createEntity(List<User> entities) {
        return userService.save(entities);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteEntity(@PathParam("id") String id) {
        userService.delete(id);
    }

}
