package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author teacher
 *
 */
@Controller
public class MyController {
	
	@RequestMapping("/go")
	public String  helloWorld() {
		return "hello";

	}

}
