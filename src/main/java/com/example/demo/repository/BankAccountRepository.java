package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.domain.BankAccount;
import com.example.demo.domain.User;

public interface BankAccountRepository extends CrudRepository<BankAccount,String>{
	Optional<BankAccount> findByPassword(String pass);


}
