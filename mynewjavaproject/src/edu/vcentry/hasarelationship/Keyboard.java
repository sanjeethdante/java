package edu.vcentry.hasarelationship;

public class Keyboard {


	  private String model;
	  private int slots;
	  private Details details;
	public Keyboard(String model, int slots, Details details) {
		
		this.model = model;
		this.slots = slots;
		this.details = details;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSlots() {
		return slots;
	}
	public void setSlots(int slots) {
		this.slots = slots;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	 
}
