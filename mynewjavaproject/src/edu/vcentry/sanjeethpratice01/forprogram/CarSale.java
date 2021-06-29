package edu.vcentry.sanjeethpratice01.forprogram;

import java.util.Scanner;

public class CarSale {

	public static void main(String[] args) {

		int penalty = 500;
		int qantity = 0;

		int reward = 1000;

		String sell = "yes";

		char rupee = '\u0061';
		Scanner scan = new Scanner(System.in);
		for (;sell.equals("yes"); qantity = qantity + 1) {

//			if (qantity == 5) {
//				//break;
//
//			}
//            

			System.out.println("want to sell one more car");
			sell = scan.next();
//
			System.out.println("the car is saled" + qantity);
			// System.out.println(sell);
		}
		if (qantity < 5) {

			System.out.println("the seller is rewarded" + reward + "" + rupee);
		} else {

			System.out.println("the car is not selled" + penalty);

		}

	}

}
