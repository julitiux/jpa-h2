package com.jpah2.repository;

import com.jpah2.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, String> {

  public List<Person> findByEmail(String email);

  public List<Person> findByNameAndEmail(String name, String email);

}
