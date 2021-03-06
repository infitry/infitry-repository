package com.infitry.base.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @since 2020. 4. 14.
 * @author leesw
 * @mail leesw504@gmail.com
 * @description : main Controller
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/")
	public String main(HttpSession session) {
		return "index";
	}
}
