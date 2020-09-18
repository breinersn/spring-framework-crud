package com.bsn.crud.serviceImplements;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsn.crud.models.User;
import com.bsn.crud.repositories.UserRepository;
import com.bsn.crud.services.UserService;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> list() {
		return repository.findAll();
	}
	/*
	@Override
	public User listId(int id) {
		return repository.findById(id);
	}
	*/
	@Override
	public User add(User user) {
		return repository.save(user);
	}
	
	@Override
	public User edit(User user) {
		return repository.save(user);
	}

	@Override
	//@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	public User delete(Long id) {
		User user = repository.findById(id);
		if(user != null) {
			repository.delete(user);
		}
		return user;
	}

}
