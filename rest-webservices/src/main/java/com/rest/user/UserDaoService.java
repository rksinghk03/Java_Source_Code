package com.rest.user;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();

	private static int usersCount = 3;

	static {
		users.add(new User(1, "Raj", new Date()));
		users.add(new User(2, "Amit", new Date()));
		users.add(new User(3, "Jack", new Date()));
		
	}
//to find all user
	public List<User> findAll() {
		return users;
	}

// to save user
		public User save(User user) {
			users.add(user);
			return user;
		}
		
// to find user by id
		public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
// to delete a user by id	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
