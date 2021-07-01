package edu.vcentry.array;

public class ArrayOddNumber {


	public void primenumber() {
		
		
		int num1[]= {2};
		
		
		
		int num2 = num1[0];
		
	    for(;num2<20;num2++) {
	    	if(num2%2==1) {
	    		
	    		
	    		System.out.println(num2);
	    	}
	    	
	    	
	    }
	
		
	}
	
	
	public static void main(String[] args) {
	
	             ArrayOddNumber num3 = new ArrayOddNumber();
		       
	             num3.primenumber();
		
	}
	
	
}