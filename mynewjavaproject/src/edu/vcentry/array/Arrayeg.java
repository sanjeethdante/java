package edu.vcentry.array;

public class Arrayeg {

	public void newarray() {

		int num = 3;

		int[] newnum = { 3, 78, 89, 96 };

		System.out.println("the newnum is printed" + newnum.length);

		System.out.println(newnum[3]);

		int lastindex = newnum.length - 1;

	

		for(int counter=0;counter<lastindex;counter++) {
			
			System.out.printf("the couter is printed %d - %d\n",counter,newnum[counter]);
			
		}
		
		
	}
		
		
		
	
	
	public static void main(String[] args) {
		Arrayeg arrayeg = new Arrayeg();
		
		arrayeg.newarray();
	
	}
	
	}

