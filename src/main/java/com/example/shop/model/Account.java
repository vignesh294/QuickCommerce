package com.example.shop.model;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private String id;
	private String fullName;
	
	public Account() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}
