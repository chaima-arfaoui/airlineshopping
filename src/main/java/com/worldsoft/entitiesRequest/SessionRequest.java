package com.worldsoft.entitiesRequest;

public class SessionRequest {
	public String UserName;
	public String AccountNumber;
	public String Password;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public SessionRequest(String userName, String accountNumber, String password) {
		super();
		UserName = userName;
		AccountNumber = accountNumber;
		Password = password;
	}

	public SessionRequest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SessionRequest [UserName=" + UserName + ", AccountNumber=" + AccountNumber + ", Password=" + Password
				+ "]";
	}
	
	

}
