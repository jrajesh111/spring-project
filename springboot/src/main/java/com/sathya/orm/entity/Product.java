package com.sathya.orm.entity;


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

public class Product
{
	@Id
	private int proId;
	private String proName;							
	private double proPrice;
	
	private LocalDateTime createATime;
	
	private String createBy;
	
}
