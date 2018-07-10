package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.newsserice;

@Controller
public class NewsController {
	
	@Autowired
	private newsserice newsserice;
	@RequestMapping("selectnewsbytitle")
	public String selectnews(Model model)
	{
		String news_text=newsserice.Selectnewsbytitle("浇灌");
		model.addAttribute("news",news_text);
		return "success";
	}

}
