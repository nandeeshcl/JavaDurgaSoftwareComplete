package onetomanyrelationship;

public class Student {
	
	private String name;
	private Address[] ad;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address[] getAd() {
		return ad;
	}
	public void setAd(Address[] ad) {
		this.ad = ad;
	}  
	

}
