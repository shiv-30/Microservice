package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.entity.Contact;
import com.contacts.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable Long userId) {
		
		return contactService.getContacts(userId);
	}
	
	@GetMapping("/all")
	public List<Contact> getAllContacts() {
		return contactService.getAllContacts();
	}
}
