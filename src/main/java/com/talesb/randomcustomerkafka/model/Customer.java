package com.talesb.randomcustomerkafka.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
	private String id;
	private String name;
	private LocalDate birthDate;
	private double balance;
	
}
