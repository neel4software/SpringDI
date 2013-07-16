package com.beingjavaguys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.dao.UserDao;

@Controller
public class HomePageController {
	@Autowired
	UserDao userDao;

	@RequestMapping("/hello")
	public ModelAndView handleRequestInternal() {
		userDao.printData();
		System.out.println("From Controller");
		return new ModelAndView("hello");
	}
}