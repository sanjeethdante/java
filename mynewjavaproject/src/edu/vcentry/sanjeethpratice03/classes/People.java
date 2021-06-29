package edu.vcentry.sanjeethpratice03.classes;

public class People {


		private String name;
		
		private int year;

//		
//		People(){
//			this.name="hjk";
//			this.year=2012;
//		 }
		
		People(String name , int year){
			this.name=name;
			this.year=year;
		}
		
		
		
		
		
		
		
		public String getname() {
			return name;
		}

		public void setname(String name) {
			this.name = name;
		}

		public int getyear() {
			return year;
		}

		public void setyear(int year) {
			this.year = year;
		}
		
		
		public void play() {
			
			System.out.println("he will play"+name);
			System.out.println("he cannot play"+year);
		    
		}

	

}
