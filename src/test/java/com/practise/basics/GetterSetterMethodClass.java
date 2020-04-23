package com.practise.basics;

class SetGet {
	
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class GetterSetterMethodClass {

	public static void main(String[] args) {

		SetGet u1=new SetGet();
		/*u1.setEmail("appu@gmail.com");
		u1.setPassword("a1234");*/
		System.out.println("Email is: "+u1.getEmail());
		System.out.println("Password is: "+u1.getPassword());

	}

}
