package edu.vcentry.array;

public class MaximumNumberArray {

	public void maxnumberarray() {
		
		
		  // int num = 2;
			
			
			int[] maxnum = {2,45,78,34,98,56,23,84,12,18};
			
			int num2=maxnum[0];
			
			System.out.printf("the maxnumber is printed%d\n",maxnum.length);
			
			//System.out.println(maxnum[6]);
			
			
			int lastindex = maxnum.length-1;
			
			for(int counter = 0;counter<lastindex;counter++) {
				
				
				System.out.printf("the maxmumnumber is %d - %d\n",counter,maxnum[counter]);
			
			if(maxnum[counter]>num2) {
				num2=maxnum[counter];
				
			}
			System.out.println(num2);
			}
			}
			
			
			
			
			public static void main(String[] args) {
				
				MaximumNumberArray maximumnumberarray = new MaximumNumberArray();
				
				maximumnumberarray.maxnumberarray();
				
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}


