package com.project.dao;

import java.util.List;

import com.project.pojo.Product;


public interface ProductMapper {
	//通过id查询产品
	public Product SelectProduct(Integer p_id);
	//通过类别查询产品
	public List<Product> selectproductbyclass(String p_class);


}
