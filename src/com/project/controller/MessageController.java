package com.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.pojo.Message;
import com.project.service.messageservice;


@Controller
public class MessageController {
	@Autowired
	private messageservice messageservice;
     @RequestMapping(value="addMessage",method=RequestMethod.POST)
	public String AddMessageservice(@RequestParam("m_text") String m_text, @RequestParam("m_name") String m_name,
			@RequestParam("m_phoneNumber") String m_phoneNumber, @RequestParam("m_mailbox") String m_mailbox) {

		Message message = new Message();
        message.setM_mailbox(m_mailbox);
        message.setM_name(m_name);
        message.setM_phoneNumber(m_phoneNumber);
        message.setM_text(m_text);
		messageservice.addMessage(message);
		return "addsuccess";
	}

}
