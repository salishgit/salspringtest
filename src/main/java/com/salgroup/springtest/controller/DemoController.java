package com.salgroup.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/saldemo", method = RequestMethod.GET)
	public String fun(@RequestParam("userName") String userName) {
		System.out.println("In controller");
		return "automation testing here " + userName;
		
		
	
	}

}