package edu.cjc.sms.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username")String username,@RequestParam("password")String password, Model m)
	{
		if("admin".equals(username)&& "admin".equals(password))
		{
			return "adminScreen";
		}
		else {
			m.addAttribute("login_fail", "username and password invalid");
			return "login";
		}
	}
	
}
