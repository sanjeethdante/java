package edu.vcentry.sanjeethpratice03.classes.inheretance;

public class Indian extends People03 {


	private String SSN;
	
	Indian(String name,int age,String SSN){
		
		super(name,age);
		this.SSN=SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public String getSSN() {
		return SSN;
	}
	
	
	public void can() {
		
		System.out.println("the id name is "+getname());
		System.out.println("the id age is"+getage());
	
	     System.out.println(getSSN());
	}
	
	
	

	
		
		
		
		
		
		

	}


