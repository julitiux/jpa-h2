package com.jpah2.repository;

import com.jpah2.domains.Usertz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsertzRepository extends JpaRepository<Usertz, String> {

  public List<Usertz> findByEmail(String email);

  public List<Usertz> findByNameAndEmail(String name, String email);

}
