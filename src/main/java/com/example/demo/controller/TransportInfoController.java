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

import com.example.demo.domain.TransportInfo;
import com.example.demo.domain.User;
import com.example.demo.repository.TransportInfoRepository;
//import com.example.demo.domain.*;
import com.example.demo.repository.UserRepository;

import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class TransportInfoController {
	@Autowired
	private TransportInfoRepository transportInfoRepoositorry;
	@ResponseBody
	@RequestMapping(path="/api/infos/save",consumes =MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public TransportInfo insertCompanies(@RequestBody TransportInfo info){

		return this.transportInfoRepoositorry.save(info);
	}
	@ResponseBody
	@RequestMapping(path="/api/infos",produces =MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public Iterable<TransportInfo> getCompanies(){
		return this.transportInfoRepoositorry.findAll();
	}
	@ResponseBody
	@RequestMapping(path="/api/infos/delete",method=RequestMethod.DELETE)
	public Iterable<TransportInfo> geCompanies(){
		return this.transportInfoRepoositorry.findAll();
	}
	 @RequestMapping(path="/api/infos/{id}",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	    @ResponseBody
		public ResponseEntity<TransportInfo> findByDriverIdNo(@PathVariable("id") String id){
	    	Optional<TransportInfo> info = this.transportInfoRepoositorry.findByDriverIdNo(id);
	    		if(info.isPresent()) {
	    			
	    			return new ResponseEntity<>(info.get(),HttpStatus.OK);
	    		}
	    		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
			
		}
}
