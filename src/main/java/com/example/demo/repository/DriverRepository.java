package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.domain.Driver;
import com.example.demo.domain.User;


public interface DriverRepository extends CrudRepository<Driver,String>{
	Optional<Driver> findByUserName(String name);

}
