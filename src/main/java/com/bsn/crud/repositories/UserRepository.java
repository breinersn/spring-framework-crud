package com.bsn.crud.repositories;

import java.util.*;

import org.springframework.data.repository.Repository;

import com.bsn.crud.models.User;

public interface UserRepository extends Repository<User, Integer> {

	List<User>findAll();
	User findById(Long id);
	User save(User user);
	void delete(User user);
}
