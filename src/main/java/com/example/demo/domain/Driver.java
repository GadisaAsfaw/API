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
public class Driver {
	public String userName;
	public String password;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public String idNo;
	
	public String licenceNo;
	public String carVin;
	public Integer carSideNo;
	public Integer seatNo;
	public String  accNo;
	

	public Driver(String userName,String password,String idNo, String licenceNo,
			       String carVin,Integer carSideNo,Integer seatNo,String accNo ) {
		this.userName = userName;
		this.password =password;
		this.idNo=idNo;
		
		this.licenceNo =licenceNo;
		this.carVin =carVin;
		this.carSideNo =carSideNo;
		this.seatNo=seatNo;
		this.accNo=accNo;
		
		
	}
	public Driver(String userName,String password, String licenceNo,
		       String carVin,Integer carSideNo,Integer seatNo,String accNo ) {
	this.userName = userName;
	this.password =password;

	
	this.licenceNo =licenceNo;
	this.carVin =carVin;
	this.carSideNo =carSideNo;
	this.seatNo=seatNo;
	this.accNo=accNo;
	
	
}

	

	public Driver() {
		
	}

	
}
