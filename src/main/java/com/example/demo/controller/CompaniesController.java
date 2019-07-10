package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.domain.*;
//import com.example.demo.repository.CompanyRepository;

import com.example.demo.domain.Company;
import com.example.demo.repository.CompanyRepository;

import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class CompaniesController {
	@Autowired
	private CompanyRepository companyRepoositorry;
	@ResponseBody
	@RequestMapping(path="/api/companys",method=RequestMethod.POST)
	public Company insertCompanies(@RequestBody Company comp){

		return this.companyRepoositorry.save(comp);
	}
	@ResponseBody
	@RequestMapping(path="/api/companys",method=RequestMethod.GET)
	public Iterable<Company> getCompanies(){
		return this.companyRepoositorry.findAll();
	}
	@ResponseBody
	@RequestMapping(path="/api/companys",method=RequestMethod.DELETE)
	public Iterable<Company> geCompanies(){
		return this.companyRepoositorry.findAll();
	}
}
