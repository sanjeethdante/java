package edu.vcentry.hasarelationship;

public class Mouse {

	private String model;
	private String company;
	private int year;
	public Mouse(String model, String company, int year) {
		
		this.model = model;
		this.company = company;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	} 
	
	

}
