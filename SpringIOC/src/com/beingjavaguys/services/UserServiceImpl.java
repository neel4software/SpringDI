package com.beingjavaguys.services;

import com.beingjavaguys.jdbc.JdbcTemplate;

public class UserServiceImpl implements UserService {

	JdbcTemplate jdbcTemplate;

	public UserServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void printdata() {
		jdbcTemplate.printdata();
		System.out.println("From Service");

	}

}
