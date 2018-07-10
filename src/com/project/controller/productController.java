package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.pojo.Product;
import com.project.service.productservice;

@Controller
public class productController {

	@Autowired
	private productservice productservice;
	
	// 通过id查询产品
	@RequestMapping("selectProductbyid")
	public String selectProductbyid(@RequestParam("id") Integer id,Model model) {
		Product product = productservice.selectProduct01(id);
		model.addAttribute("product", product);
		return "success";

	}

	// 通过类别查询产品
	@RequestMapping(value = "selectProductbyclass")
	public String selectProductbyclass(@RequestParam("name") String name,Model model) {
		List<Product> product01 = productservice.Selectproductbyclass(name);
		model.addAttribute("product_class", product01);
		return "success";
	}

}
