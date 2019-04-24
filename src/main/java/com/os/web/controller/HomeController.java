package com.os.web.controller;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
@Autowired
private DataSource ds;

@RequestMapping("/")
public String goHome() {
	try {
		log.info("con=>",ds.getConnection());
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return "index";
}

@RequestMapping("/test")
public String goTest(Model m) {
	try {
		log.info("con=>",ds.getConnection());
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return "test";
}
}
