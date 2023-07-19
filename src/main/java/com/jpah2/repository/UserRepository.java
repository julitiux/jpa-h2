package com.jpah2.repository;

import com.jpah2.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

  public List<User> findByEmail(String email);

  public List<User> findByNameAndEmail(String name, String email);

}
