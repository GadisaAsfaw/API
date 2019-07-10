package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Driver;
import com.example.demo.domain.User;
import com.example.demo.repository.DriverRepository;

import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class DriverController {
	@Autowired
	private DriverRepository driverRepoositorry;
	
	@ResponseBody
	@RequestMapping(path="/api/drivers/save",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public Driver insertCompanies(@RequestBody Driver comp){

		return this.driverRepoositorry.save(comp);
	}
	
	@ResponseBody
	@RequestMapping(path="/api/drivers",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public Iterable<Driver> getCompanies(){
		return this.driverRepoositorry.findAll();
	}
	@ResponseBody
	@RequestMapping(path="/api/drivers/delete",method=RequestMethod.DELETE)
	public Iterable<Driver> geCompanies(){
		return this.driverRepoositorry.findAll();
	}
	  @RequestMapping(path="/api/drivers/{name}",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	    @ResponseBody
		public ResponseEntity<Driver> findByName(@PathVariable("name") String name){
	    	Optional<Driver> driver =this.driverRepoositorry.findByUserName(name);
	    	//Optional<User> user =userRepo.findById(name);
	    	
	    		if(driver.isPresent()) {
	    			System.out.println("Hello"+driver.get().userName);
	    			return new ResponseEntity<>(driver.get(),HttpStatus.OK);
	    		}
	    		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
			
		}
}
