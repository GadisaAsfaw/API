package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.domain.TransportInfo;
import com.example.demo.domain.User;


public interface TransportInfoRepository extends CrudRepository<TransportInfo,String>{
	Optional<TransportInfo> findByDriverIdNo(String id);
	//Optional<User> findByUserName(String name);

}
