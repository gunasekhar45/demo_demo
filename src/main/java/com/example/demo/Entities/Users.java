package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	int userId;
	String userName;
	char userType;
	long mobileNo;
	String emailId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char getUserType() {
		return userType;
	}
	public void setUserType(char userType) {
		this.userType = userType;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Users(int userId, String userName, char userType, long mobileNo, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}