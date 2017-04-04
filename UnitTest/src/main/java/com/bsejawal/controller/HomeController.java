package com.bsejawal.controller;

import org.springframework.stereotype.Controller;

@Controller("/")
public class HomeController {

	public String index() {
		return "Hello World";
	}

}
