package edu.vcentry.sanjeethpratice03.classes.constructor;

public class Main {

	public static void main(String[] args) {

		People01 lk = new People01();
		
		lk.setname("tan");
		lk.setyear(1999);
		
		System.out.println("the name is printed"+lk.getname());
		System.out.println("the year is printed"+lk.getyear());
		
		
		People01 jk=lk;
		
		System.out.println(jk.getname());
		System.out.println(jk.getyear());
		
		
		
		
		
		
		
		
	}

}
