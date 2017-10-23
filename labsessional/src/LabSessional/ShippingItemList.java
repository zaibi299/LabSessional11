package LabSessional;

import java.util.*;

public class ShippingItemList implements Container {
	private String names[] = {"orange", "apple", "mango", "pineapple"};
	private int weight = 4;
	 
	@Override
	public Calculator getCalculator() {
		// TODO Auto-generated method stub
		return new ShipmentCostCalculator();
	}
	
	public class ShipmentCostCalculator implements Calculator {
		 private double cost= 0;
		public double costlessthan() {
			if (weight <= 5 ){
				cost = weight * 0.75;
				
			}
			return cost;
		}
		public double costmorethan(){
			if (weight > 5 ){
				cost = weight * 0.75;
			}
			return cost;
			
			
		}
		
	}

	public static Calculator ShipmentCostCalculator() {
		// TODO Auto-generated method stub
		return null;
	}

	

	


}
