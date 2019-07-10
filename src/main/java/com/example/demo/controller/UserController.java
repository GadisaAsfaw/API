package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
//import com.example.demo.domain.*;
import com.example.demo.repository.UserRepository;

import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@ResponseBody
	@RequestMapping(path="/api/users/save",consumes =MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public User insertCompanies(@RequestBody User comp){
		return this.userRepo.save(comp);
	}
	@ResponseBody
	@RequestMapping(path="/api/users",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public Iterable<User> getCompanies(){
		return this.userRepo.findAll();
	}
	@ResponseBody
	@RequestMapping(path="/api/users",method=RequestMethod.DELETE)
	public Iterable<User> geCompanies(){
		return this.userRepo.findAll();
		//return this.userRepo.findById("aa");
	}
	
	//@GetMapping("/{name}")
   @RequestMapping(path="/api/users/{name}",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
    @ResponseBody
	public ResponseEntity<User> findByName(@PathVariable("name") String name){
    	Optional<User> user =userRepo.findByUserName(name);
    	//Optional<User> user =userRepo.findById(name);
    	
    		if(user.isPresent()) {
    			System.out.println("Hello"+user.get().userName);
    			return new ResponseEntity<>(user.get(),HttpStatus.OK);
    		}
    		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		
	}
   /* @RequestMapping(path="/api/users/{name}",produces="appilication/json",method=RequestMethod.GET)
    @ResponseBody
	public User findByName(@PathVariable("name") String name){
    	Optional<User> user =userRepo.findByUserName(name);
    	//Optional<User> user =userRepo.findById(name);
    	System.out.println("Hello"+user.get().userName);
   
    		
    			return user.get();
    		
		
	}*/
}
