package com.epam.springadvanced.service;

import com.epam.springadvanced.domain.Person;

public interface PersonService {
	void save(Person person);
	Person findOne(Integer id);

}
