package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.pclassservice;

@Controller
public class PClassController {
	@Autowired
	private pclassservice pclassservice;
	//通过类别查询产品
		@RequestMapping("selectPCNames")
		public String selectProductbyclass(Model model)
		{
			List<String> PCnames=pclassservice.selectpClassnames();
			model.addAttribute("PCnames",PCnames);
			return "success";
			
		}

}
