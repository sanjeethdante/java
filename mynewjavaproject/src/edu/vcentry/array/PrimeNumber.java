package edu.vcentry.array;

public class PrimeNumber {

	        
	       public void primenumber() {
	    	   
	    	   
	    	   int []num1= {10};
	    	   
	    	   int num2=num1[0];
	    	   
	    	   for(;num2<100;num2++) {
	    		    
//                   if(num2%2==0) {
//                	   
//                	   System.out.println(num2);
//                	   
                   }
	    		   
	    	  //}
	    	   
                for(int num3=10;num3<=num2;num3++) {
                	
                	if(num2%num3==0) {
                		
                		
                	}
                 	num3=num3+1;
                 	System.out.println(num3);             
                
                }
                
                
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	       }
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		 PrimeNumber op = new PrimeNumber();
		 
		 op.primenumber();

		
	}

}
