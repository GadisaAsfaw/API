package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.domain.Company;

public interface CompanyRepository extends CrudRepository<Company,Long>{

}
