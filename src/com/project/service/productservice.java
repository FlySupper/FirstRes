package com.project.service;

import java.util.List;

import com.project.pojo.Product;

public interface productservice {
	//通过id查询产品
	public Product selectProduct01(Integer p_id);
	//通过类别查询产品
	public List<Product> Selectproductbyclass(String p_class);

}