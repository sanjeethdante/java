package edu.vcentry.sanjeethpratice03.classes.inheretance;

public class People03 {

	private String name;
	private int age;
	
	People03(){
		
		super();
		
	}

	People03(String name,int age){
		
		this.name = name;
		this.age = age;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}
	
	public void can() {
		
		System.out.println("the pan card is give"+getname());
		System.out.println("the pan card age is "+age);
	    System.out.println("the proof is "+getage());
        System.out.println("the form is "+name);	
	  
	}
	
	
	
	
	
	
	
	
	
	
	
}
