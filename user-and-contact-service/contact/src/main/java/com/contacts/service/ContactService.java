package com.contacts.service;

import java.util.List;

import com.contacts.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContacts(Long userId);
	
	public List<Contact> getAllContacts();
	
}
