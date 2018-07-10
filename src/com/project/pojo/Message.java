package com.project.pojo;


  //留言表

public class Message {
	private int m_id;         //ID
	private String m_text;    //内容
	private String m_name;    //姓名
	private String m_phoneNumber;//手机号
	private String m_mailbox;//邮箱
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_text() {
		return m_text;
	}
	public void setM_text(String m_text) {
		this.m_text = m_text;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_phoneNumber() {
		return m_phoneNumber;
	}
	public void setM_phoneNumber(String m_phoneNumber) {
		this.m_phoneNumber = m_phoneNumber;
	}
	public String getM_mailbox() {
		return m_mailbox;
	}
	public void setM_mailbox(String m_mailbox) {
		this.m_mailbox = m_mailbox;
	}
}
