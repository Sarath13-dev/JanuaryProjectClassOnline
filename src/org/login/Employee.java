package org.login;
public class Employee {

	private String username;
	
	private int password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String a) {
		if(a.equals("Sarath")) {
		this.username = "Learn Selenium";
		}
		else if(a.equals("Ravi")) {
			this.username="Manual testing";
		}
		else {
			this.username="incorrect user";
		}
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int b) {
		this.password = b;
	}
	
	
	
	
	
	
	
	
	
	
	
}
