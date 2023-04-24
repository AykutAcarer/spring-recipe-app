package com.springframework.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author Aykut Acarer
 *created on 23.04.2023
**/

@Controller
public class IndexController {

	@RequestMapping({"", "/", "/index", "index.html"})
	public String getIndexPage() {
		return "index";
	}
}
