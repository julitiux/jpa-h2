package com.jpah2.service.impl;

import com.jpah2.domains.Usertz;
import com.jpah2.repository.UsertzRepository;
import com.jpah2.service.UsertzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsertzServiceImpl implements UsertzService {


  @Autowired
  UsertzRepository usertzRepository;

  @Override
  public Usertz save(Usertz usertz) {
    return usertzRepository.save(usertz);
  }
}
