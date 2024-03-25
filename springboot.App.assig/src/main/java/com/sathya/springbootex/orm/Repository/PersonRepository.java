package com.sathya.springbootex.orm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.springbootex.orm.entity.Person;
@Repository
public interface PersonRepository  extends JpaRepository<Person, Integer>
{
	
}
