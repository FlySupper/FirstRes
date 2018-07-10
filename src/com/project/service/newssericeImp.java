package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.NewsMapper;



@Service
public class newssericeImp implements newsserice {

	@Autowired
	private NewsMapper newsMapper;

	@Override
	public String Selectnewsbytitle(String n_name) {
		String news_text = newsMapper.selectnewsbytitle(n_name);
		return news_text;
	}

}
