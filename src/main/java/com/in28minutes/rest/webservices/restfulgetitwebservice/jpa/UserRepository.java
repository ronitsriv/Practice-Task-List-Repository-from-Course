package com.in28minutes.rest.webservices.restfulgetitwebservice.jpa;


import org.h2.engine.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
