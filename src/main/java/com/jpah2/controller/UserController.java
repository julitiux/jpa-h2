package com.jpah2.controller;

import com.jpah2.domains.User;
import com.jpah2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(path = "/saveUser", method = RequestMethod.POST)
  public User saveUser(@RequestBody User user) {
    return userService.save(user);
  }


}

