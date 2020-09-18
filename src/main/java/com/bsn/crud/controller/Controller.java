package com.bsn.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsn.crud.models.User;
import com.bsn.crud.services.UserService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping({"/usuarios"})
@RestController
public class Controller {

	@Autowired
	UserService service;
	
	@GetMapping(path = {"/list"})
	public List<User>list(){
		return service.list();
	}
	/*
	@GetMapping(path = {"/{id}"})
	public User ListId(@PathVariable("id")int id) {
		return service.listId(id);
	}
	*/
	
	@PostMapping
	public User add(@RequestBody User user) {
		return service.add(user);
	}
	
	@PutMapping(path = {"/{id}"})
	public User edit(@RequestBody User user, @PathVariable("id") Long id ) {
		user.setId(id);
		return service.add(user);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public User delete(@PathVariable("id") Long id) {
		return service.delete(id);
	}
}
 