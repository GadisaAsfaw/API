package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	

	public String name;
	

	public String address;
	

	public String logoUrl;

	
	public String detail ;
	public Company(String name,String address,String logoUrl,String detail) {
		this.address=address;
		this.name=name;
		this.logoUrl=logoUrl;
		this.detail=detail;
	}
	public Company(Long Id,String name,String address,String logoUrl,String detail) {
		this.Id=Id;
		this.address=address;
		this.name=name;
		this.logoUrl=logoUrl;
		this.detail=detail;
	}

	public Company() {
		
	}

	
}
