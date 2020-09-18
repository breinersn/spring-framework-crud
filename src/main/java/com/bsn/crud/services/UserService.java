package com.bsn.crud.services;

import java.util.List;

import com.bsn.crud.models.User;

public interface UserService {

	List<User>list();
    //User listId(int id);
    User add(User user);
	User edit(User user);
	User delete(Long id);
}
