package JavaCollections;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Values will be only sort based on the Key values 

		TreeMap<String, String> Locations = new TreeMap<String , String>();
		Locations.put("Selenium ", "Testing");
		Locations.put("Tossca", "Testing");
		Locations.put("Katalon Studio", "Testing");
		Locations.put("RFT", "Testing");
		Locations.put("UFT", "Testing");

		System.out.println(Locations);

		//adding duplicated values 
		//Values will be get over ride
		//Means it will be select most similar one value 
		Locations.put("selendroid ", "Tester 1 ");
		Locations.put("selendroid ", "Tester 2" );

		System.out.println(Locations);

       //Null insertion should not be possible in TreeMap
		
		Locations.put(null, " Value 1");
		Locations.put(null, " Value 2");
		
		System.out.println(Locations);//
	}

}
