package com.sathya.springbootex.orm.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person 
{
	//Entity class
	@Id
	private int personId;
	private String firstName;
	private String lastName;
	private String email;
	private int personAge;
	
	private LocalDateTime createAt;
	
	private String createBy;
	
	
}
