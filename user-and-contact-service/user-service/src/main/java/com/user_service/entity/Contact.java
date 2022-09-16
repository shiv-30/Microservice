package com.user_service.entity;

public class Contact {
	private Long cId;
	private String email;
	private String contacName;
	private Long userId;
	
	
	public Contact(Long cId, String email, String contacName, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contacName = contacName;
		this.userId = userId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Contact(Long cId, String email, String contacName) {
		super();
		this.cId = cId;
		this.email = email;
		this.contacName = contacName;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContacName() {
		return contacName;
	}
	public void setContacName(String contacName) {
		this.contacName = contacName;
	}
	
	
}
