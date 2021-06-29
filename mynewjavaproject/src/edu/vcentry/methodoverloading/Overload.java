package edu.vcentry.methodoverloading;

public class Overload {

	
		public void overload (String name,int age) {
			
			if(age>56) {
				
				System.out.printf("he can drive%s/n",name);
			}else if (age >78) {
				
				System.out.printf("he can not drive%s/n",name);
			}else {
				
				System.out.printf("he can drive%s/n",name);
			}
			
			
			
			
			
			
		}
		
		
		public void overload (int age,String name) {
			
			overload(name,age);
			System.out.println("he can drive");
		}
		
		
		
		
		public void overload(int age) {
			String name = "unkown";
			overload(name,age);
			System.out.println("he cannot  drive");
			
			
		}
		
		
	
			
		
		
		
		public static void main(String[] args) {
		 
		    Overload lg = new Overload();
			lg.overload("hari", 89);
		    lg.overload(67,"ram");
		
		
			lg.overload(87);
		}
		
		

	}


