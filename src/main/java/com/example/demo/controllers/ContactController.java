package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContactDTO;
import com.example.demo.dto.ContactResponseDTO;

@RestController
public class ContactController {
	@PostMapping(path = "/create_contact", 
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ContactResponseDTO> createContact(@RequestBody ContactDTO contact) {

		ContactResponseDTO response = new ContactResponseDTO();
		response.prepareMsg(contact.nome);

		return ResponseEntity.ok().body(response);
	}
}
