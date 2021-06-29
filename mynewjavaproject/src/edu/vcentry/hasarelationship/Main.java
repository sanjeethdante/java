package edu.vcentry.hasarelationship;

public class Main {

	public static void main(String[] args) {

		Details mydet = new Details(90,67);
		
		Keyboard mykey = new Keyboard("han",56,mydet);
		
		Mouse mymou = new Mouse("gan","yaa",2002);
		
		
		Pc mypc = new Pc(mykey,mymou);
		
		System.out.println(mypc.getKeyboard().getModel());
		System.out.println(mypc.getKeyboard().getDetails().getLength());
		
		
		
		
		
		
		
		
	}

}
