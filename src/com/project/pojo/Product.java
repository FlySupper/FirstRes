package com.project.pojo;

import java.io.Serializable;

//产品表


public class Product implements Serializable{
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_picture=" + p_picture + ", p_class=" + p_class
				+ "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int p_id;//产品id
	private String p_name;//产品名
	private String p_picture;//产品图片
	private String p_class;//产品类别
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_picture() {
		return p_picture;
	}
	public void setP_picture(String p_picture) {
		this.p_picture = p_picture;
	}
	public String getP_class() {
		return p_class;
	}
	public void setP_class(String p_class) {
		this.p_class = p_class;
	}
	public Product(int p_id, String p_name, String p_picture, String p_class) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_picture = p_picture;
		this.p_class = p_class;
	}
	
	public Product(){}
}
