package org.add;

public class Greens extends GreensTech  {

	@Override
	public void greensOmr() {
	System.out.println("Greens Omr : Bye");
	super.greensOmr();
	}
	
	@Override
	public void greensOmr(int Flate) {
    System.out.println("Flate No : " +Flate);
	super.greensOmr(Flate);
	}
	
	@Override
	public void greensOmr(int price, float ground) {
	System.out.println("price : Rs " +price+"\nGround : "+ground+"\tsq.ft");
	super.greensOmr(price, ground);
	}
	public static void main(String[] args) {
		
		GreensTech y = new GreensTech();
		y.greensOmr();
		y.greensOmr(65);
		y.greensOmr(8500000, 60.54f);
		
		
		
	}
	
	
	
	
	
}
