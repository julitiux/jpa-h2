package com.jpah2.controller;

import com.jpah2.domains.Person;
import com.jpah2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

  @Autowired
  PersonService personService;

  @RequestMapping(path = "/savePerson", method = RequestMethod.POST)
  public Person savePerson(@RequestBody Person person) {
    return personService.save(person);
  }

}

