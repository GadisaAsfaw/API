package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.domain.User;

public interface UserRepository extends CrudRepository<User,String>{
	Optional<User> findByUserName(String name);
         //User findByUserName(String name);
}
