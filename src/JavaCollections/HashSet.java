package JavaCollections;

import java.util.Iterator;
import java.util.List;

public class HashSet {
	public void HashSett() {

		java.util.HashSet<String> hashset = new java.util. HashSet<>();
		
		//Add elements to the the Hash set
		// Hash set should not follow any order 
		// It should not support duplicates 
		
		hashset.add("Null");
		hashset.add("Test 1");
		hashset.add("Test 2");
		hashset.add("Test 3");
		hashset.add("Test 3");
		hashset.add(null);
		

		System.out.println(hashset);
		
		//remove an element from hash set
		
		hashset.remove(null);
		System.out.println(hashset);
		
		Iterator<String> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println("Hash set is " + iterator.next());			
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet Test = new HashSet();
		Test.HashSett();

	}

}
