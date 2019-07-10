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
public class BankAccount {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public String acc_number;
	public String password;
	public Float balance;
	
	
	public BankAccount(String acc_number,String password,Float balance) {
		this.acc_number= acc_number;
		this.password =password;
		this.balance= balance;
		
	}

	public BankAccount(String password,Float balance) {
		this.password =password;
		this.balance= balance;
		
	}

	public BankAccount() {
		
	}

	
}
