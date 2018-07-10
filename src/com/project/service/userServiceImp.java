package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userServiceImp implements userService {
	@Autowired
	private com.project.dao.userMapper userMapper;

	@Override
	public boolean selectUsername(String username) {
		
		int i=userMapper.selectUsername(username);
		
		return i>0?false:true;
	}

}
