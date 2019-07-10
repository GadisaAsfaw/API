package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class User {
	//if id is integer
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//if id is String
	//@Id @GeneratedValue(generator="system-uuid")
	//@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id
	public String idNo;
	

	public String userName;
	

	public String password;
	

	public String userType;

	
	
	public User(String userName,String password,String userType) {
		this.userName = userName;
		this.password =password;
		this.userType =userType;
		
	}
	public User(String idNo,String userName,String password,String userType) {
		this.idNo =idNo;
		this.userName = userName;
		this.password =password;
		this.userType =userType;
	}

	public User() {
		
	}

	
}
