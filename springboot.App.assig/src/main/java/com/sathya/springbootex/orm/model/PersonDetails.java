package com.sathya.springbootex.orm.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

public class PersonDetails 
{
	private int personId;
	private String firstName;
	private String lastName;
	private String email;
	private int personAge;
}
