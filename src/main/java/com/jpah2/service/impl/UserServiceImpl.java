package com.jpah2.service.impl;

import com.jpah2.domains.User;
import com.jpah2.repository.UserRepository;
import com.jpah2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {


  @Autowired
  UserRepository userRepository;

  @Override
  public User save(User user) {
    return userRepository.save(user);
  }
}
