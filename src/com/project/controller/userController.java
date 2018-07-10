package com.project.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.service.userService;

@Controller
public class userController {
	@Autowired
	private userService userService;
	@RequestMapping("/selectUsername")
	@ResponseBody
	public String selectUsername(String username)
	{
		boolean b=userService.selectUsername(username);
		return "{\"isExit\":\"b\"}";
	}

}
