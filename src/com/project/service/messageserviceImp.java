package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.MessageMapper;
import com.project.pojo.Message;

@Service
public class messageserviceImp implements messageservice {
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public void addMessage(Message message) {
		messageMapper.addmessage(message);
	}

}
