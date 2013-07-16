package com.beingjavaguys.dao;

import com.beingjavaguys.services.UserService;

public class UserDaoImpl implements UserDao {

	UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void printData() {
		userService.printdata();
		System.out.println("From Dao");

	}

}
