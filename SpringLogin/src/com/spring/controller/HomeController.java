package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.LoginInfo;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String viewHomePage(@ModelAttribute("userinfo") LoginInfo logininfo)
	{
	  
	   return"home-page";	
	}

	@RequestMapping("/success")
	public String result(@ModelAttribute("userinfo") LoginInfo logininfo)
	{
		
		return"result-page";
	}
}
