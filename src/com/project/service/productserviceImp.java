package com.project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ProductMapper;
import com.project.pojo.Product;

@Service
public class  productserviceImp implements productservice {

	@Autowired
	private ProductMapper productmapper;
	
	@Override
	public Product selectProduct01(Integer p_id) {
		Product product=productmapper.SelectProduct(p_id);
		return product;
	}

	@Override
     public List<Product> Selectproductbyclass(String p_class) {
		
		List<Product> product=productmapper.selectproductbyclass(p_class);
		return product;
	}

	
	
}
