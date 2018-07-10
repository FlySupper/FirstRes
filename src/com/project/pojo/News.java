package com.project.pojo;

//
//新闻表


public class News {
	private int n_id;//新闻id
	private String n_name;//新闻标题
	private String n_text;//新闻内容
	public int getN_id() {
		return n_id;
	}
	public void setN_id(int n_id) {
		this.n_id = n_id;
	}
	public String getN_name() {
		return n_name;
	}
	public void setN_name(String n_name) {
		this.n_name = n_name;
	}
	public String getN_text() {
		return n_text;
	}
	public void setN_text(String n_text) {
		this.n_text = n_text;
	}
}
