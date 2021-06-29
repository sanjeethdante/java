package edu.vcentry.sanjeethpratice02.forprogram.whileprogram;

import java.util.Scanner;

public class CellPhone {

	public static void main(String[] args) {
	    
         int quantity=0;
	
		
		int reward = 5000;
		
		int penalty=2500;
		
		String saler = "yes";
		
		char rupee = '\u0061';
		
		Scanner scan = new Scanner(System.in); 
		
		while(saler.equals("yes")) {
//			
//			if(quantity==10) {
//				
//				break;
//			}
			quantity = quantity+1;
			
		
			System.out.println("the saler salling a phone"+quantity);
			
		saler=scan.next();		
		
		}
		
		
		if(6>quantity) {
			
			System.out.println("the phone is saled"+reward+""+rupee);
		}else {
			
			System.out.println("the phone is not saled"+penalty+""+rupee);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
