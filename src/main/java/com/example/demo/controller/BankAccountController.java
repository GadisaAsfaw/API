package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.domain.BankAccount;
import com.example.demo.repository.BankAccountRepository;
//import com.example.demo.domain.*;
import com.example.demo.repository.UserRepository;

import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RequestMapping(path="/api",produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
@CrossOrigin(origins="*")
public class BankAccountController {
	@Autowired
	private BankAccountRepository accountRepoositorry;

	//@RequestMapping(path="/api/baccounts",method=RequestMethod.POST)
	@PostMapping(path="/accounts/save/b",consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BankAccount insertCompanies(@RequestBody BankAccount comp){

		return this.accountRepoositorry.save(comp);
	}
	@PutMapping(path="/accounts/save",consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BankAccount updateCompanies(@RequestBody BankAccount comp){

		return this.accountRepoositorry.save(comp);
	}
	
	//@RequestMapping(path="/api/baccounts",produces="application/hal+json",method=RequestMethod.GET)
	@ResponseBody
	@GetMapping(path="/accounts")
	public Iterable<BankAccount> getCompanies(){
		return this.accountRepoositorry.findAll();
	}
	@ResponseBody
	@DeleteMapping(path="/accounts/delete")
	//@RequestMapping(path="/baccunts",method=RequestMethod.DELETE)
	public Iterable<BankAccount> geCompanies(){
		return this.accountRepoositorry.findAll();
	}
	
    //@RequestMapping(path="/api/users/{name}",produces="appilication/json",method=RequestMethod.GET)
	@GetMapping("/accounts/{accno}")
	@ResponseBody
	public ResponseEntity<BankAccount> findByName(@PathVariable("pass") String pass){
    	Optional<BankAccount> user =accountRepoositorry.findByPassword(pass);
    	
    		if(user.isPresent()) {
    			return new ResponseEntity<>(user.get(),HttpStatus.OK);
    		}
    		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		
	}
}
