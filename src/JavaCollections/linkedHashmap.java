package JavaCollections;

import java.util.LinkedHashMap;

public class linkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap & Linked Hashmap are same . 
		//But the difference is linkedHashmap will be follow the Insertion Orders
		
		java.util.LinkedHashMap<Integer,String> LinkedemployeeMap = new LinkedHashMap<>();
		LinkedemployeeMap.put(1, "Tester 1");
		LinkedemployeeMap.put(50, "Tester 25");
		LinkedemployeeMap.put(3, "Tester 3");
		LinkedemployeeMap.put(18, "Tester 12");
		LinkedemployeeMap.put(5, "Tester 8");

		System.out.println(LinkedemployeeMap);
		
		


	}

}
