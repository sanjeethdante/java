package edu.vcentry.basics.session05.forloop;

import java.util.Scanner;

public class CarSale {

	public static void main(String[] args) {

		int penalty = 500;
		int qantity = 0;

		int reward = 1000;

		String sell = "yes";

		char rupee = '\u0061';
		Scanner scan = new Scanner(System.in);
		for (int carcount = 5; carcount <= reward; carcount = carcount + 1) {

			if (scan.equals("yes")) {
			
				if (qantity == 5) {
					break;
					
				
				}
			
			}

			qantity = qantity + 1;
			sell = scan.next();

			System.out.println("the car is saled" + qantity);
			System.out.println(sell);

		

		if (carcount > qantity) {

			System.out.println("the seller is rewarded" + reward + "" + rupee);
		} else {

			System.out.println("the car is not selled" + penalty);

		}

		}
	
	}

}
