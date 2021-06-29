package edu.vcentry.dowhile;

public class DoWhile {

	public static void main(String[] args) {
		
		int num = 30;
        int num2 = 0;
        
        int num3= num%2;
		do {
			
			if(num3==0) {
				System.out.println(num);
			
				if(num2==10) {
					
					break;
				}
				num2=num2+1;
			}
			num=num+1;
			
		}
		while(num<60);
		
		
		
		
		
		
		

	}

}
