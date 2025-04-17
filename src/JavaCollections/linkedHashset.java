package JavaCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashset {
	
	public void LinkedHashsett() {
		
		Set<String> linkedHashset = new LinkedHashSet<>();
		
		//Add Elements to LinkedHash set
		linkedHashset.add(null);
		linkedHashset.add("Test 1");
		linkedHashset.add("Test 2");
		
		//It should bbe follow insertion Order
		//It allows Null Values 
		
		System.out.println(linkedHashset);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linkedHashset testt = new linkedHashset();
		testt.LinkedHashsett();
	}

}
