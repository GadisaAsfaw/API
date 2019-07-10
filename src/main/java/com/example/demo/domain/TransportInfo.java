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
public class TransportInfo {
	
	public String startPos;
	public String destinationPos;
	public String transportDate;
	public String transportTime;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public String driverIdNo;
	

	

	
	
	public TransportInfo(String startPos,String destinationPos,
			String transportDate, String transportTime) {
		this.startPos =startPos;
		this.destinationPos =destinationPos;
		this.transportDate=transportDate;
		this.transportTime=transportTime;
		
		
		
	}
	public TransportInfo(String startPos,String destinationPos,
			String transportDate, String transportTime,String driverIdNo) {
		this.startPos =startPos;
		this.destinationPos =destinationPos;
		this.transportDate=transportDate;
		this.transportTime=transportTime;
		this.driverIdNo=driverIdNo;
		
		
	}
	
	

	public TransportInfo() {
		
	}

	
}
