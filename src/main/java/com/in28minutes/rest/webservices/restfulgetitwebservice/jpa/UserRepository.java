package com.in28minutes.rest.webservices.restfulgetitwebservice.jpa;

import com.in28minutes.rest.webservices.restfulgetitwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
