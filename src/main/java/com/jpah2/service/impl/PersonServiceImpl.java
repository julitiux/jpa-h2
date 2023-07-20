package com.jpah2.service.impl;

import com.jpah2.domains.Person;
import com.jpah2.repository.PersonRepository;
import com.jpah2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {


  @Autowired
  PersonRepository personRepository;

  @Override
  public Person save(Person person) {
    return personRepository.save(person);
  }
}
