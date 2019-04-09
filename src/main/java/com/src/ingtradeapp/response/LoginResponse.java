package com.src.ingtradeapp.response;

public class LoginResponse {
	
	private String sessionid;
	private Boolean statu;
	private String role;
	private String accountnumber;
	
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public Boolean getStatu() {
		return statu;
	}
	public void setStatu(Boolean statu) {
		this.statu = statu;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	

}
