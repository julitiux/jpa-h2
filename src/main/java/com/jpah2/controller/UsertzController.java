package com.jpah2.controller;

import com.jpah2.domains.Usertz;
import com.jpah2.service.UsertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usertz")
public class UsertzController {

  @Autowired
  UsertzService usertzService;

  @RequestMapping(path = "/saveUsertz", method = RequestMethod.POST)
  public Usertz saveUsertz(@RequestBody Usertz usertz) {
    return usertzService.save(usertz);
  }

}

