package JavaCollections;

import java.util.HashSet;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generic 	should be have Key & Values
		//instead of add we need to use Put();
		java.util.HashMap<Integer, String> employeeMap = new java.util.HashMap<Integer , String>();
		employeeMap.put(1, "Tester 1");
		employeeMap.put(51, "Tester 2");
		employeeMap.put(5, "Tester 3");
		employeeMap.put(4, "Tester 4");
		employeeMap.put(48, "Tester 5");

		System.out.println(employeeMap);
		
		//Copy All the Values into New Hashmap
		//Need to use Putall() insetad of addall()
		
		java.util.HashMap<Integer, String> copiedmap = new java.util.HashMap<Integer , String>();
		copiedmap.putAll(employeeMap);
		System.out.println("The Copied Map is : " + copiedmap);

		//To find the key value is available into the Hashmap ---> ContainsKey();
		//To find the value is available into the Hashmap ---> ContainsValue();
		
		System.out.println("Availability of Key 5 : "+ copiedmap.containsKey(5) );
				
		System.out.println("Availability of Key 5 : "+ copiedmap.containsValue("Tester 5"));
		
		//Duplicate the Hashmap elements instead of using Putall() ------> Clone()
		System.out.println("The newly cloned set is :"+ employeeMap.clone());
		
		//To Print only all the key values 
		System.out.println("Print only all the Key Values " + employeeMap.keySet());
		
		//To Retrieve a specific value -------> Get();
		System.out.println(employeeMap.get(1));
		
		//To print all the Values --------Values()
		System.out.println("The Values of Employemap is "+ employeeMap.values());
		
		//To print all the Key & Values ----->Entryset()
		//Every key & Values should be considered as "Entry"
	
		System.out.println("The all key & Values from the emplyeemap is :"+employeeMap.entrySet());
	}


}
