package com.sanjit.phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sanjit.phonebook.Entity.Contact;
import com.sanjit.phonebook.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		contact.setActiveSw("y");
		Contact save =contactRepo.save(contact);
		
		if (save.getContactId()!=null)
		{
			return true;
		}
		return false;
		
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactRepo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		java.util.Optional<Contact> findById = contactRepo.findById(contactId);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
		
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		java.util.Optional<Contact> findById = contactRepo.findById(contactId);
		if (findById.isPresent())
		{
			Contact contact =findById.get();
			contact.setActiveSw("n");
			contactRepo.save(contact);
			return true;
		}
		else
			return false;
			
			
		
		
	}

}
