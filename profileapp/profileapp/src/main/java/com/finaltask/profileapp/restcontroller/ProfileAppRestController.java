package com.finaltask.profileapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finaltask.profileapp.model.Contact;
import com.finaltask.profileapp.model.Expertise;
import com.finaltask.profileapp.repository.ContactRepository;
import com.finaltask.profileapp.repository.ExpertiseRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProfileAppRestController {

	@Autowired
	private ExpertiseRepository expertiseRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	

	
	@GetMapping("/expertise")
	public List<Expertise> getExpertises()
	{
		return expertiseRepository.findAll();
	}
	@PostMapping("/saveexpertise")
	public Expertise saveExpertiseDetails(@RequestBody Expertise expertise)
	{
		return expertiseRepository.save(expertise);
	}
	
	@PostMapping("/savecontactdetails")
	public Contact submitContactForm(@RequestBody Contact contact)
	{
		return contactRepository.save(contact);
		
	}
	@GetMapping("/contactdetails")
	public List<Contact> getContactDetails()
	{
		return contactRepository.findAll();
	}
	
	
	
	@GetMapping("/home")
	public String getHomeDetails() {
		return "I am a java Developer and hands experience on java technologies";
	}
	

}

