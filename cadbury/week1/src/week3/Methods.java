package week3;

import java.util.ArrayList;

public class Methods {
	
	Methods(String name){
		System.out.println("hello mr :" +name);
		
	}
 void bikes() {
	  ArrayList <String> bikes = new ArrayList<String>();
	  bikes.add("yamaha fz");
	  bikes.add("royal enfield meteor 350");
	  bikes.add("Harley Davidson fatboy 1100");
	System.out.println(bikes.toString());
 }
	public void  cars() {
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("lambhogini");
	cars.add("bugatti");
	cars.add("ferarri");
	cars.add("aston martin");
	System.out.println(cars.toString());
}
 }
