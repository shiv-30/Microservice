package com.contacts.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	
	List<Contact> list = List.of(
			new Contact(1L, "roshan@gmail.com", "Roshan", 1331L),
			new Contact(2L, "sita@email.com", "Sita", 1331L),
			new Contact(3L, "shyam@email.com", "Shyam", 1333L)
	);
	
	@Override
	public List<Contact> getContacts(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return list;
	}
	
	
}
