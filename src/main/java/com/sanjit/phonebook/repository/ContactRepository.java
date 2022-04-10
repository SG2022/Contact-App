package com.sanjit.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjit.phonebook.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	
	

}
