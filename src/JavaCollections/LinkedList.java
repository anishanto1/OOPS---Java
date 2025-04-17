package JavaCollections;

import java.util.List;

public class LinkedList {
	
	public void LinkedListt() {
		
	List<Integer> linkedList = new java.util.LinkedList<>();
	
	//Adding Elements to the LinkedList

	linkedList.add(0);
	linkedList.add(1);
	linkedList.add(2);
	linkedList.add(3);
	linkedList.add(4);
	
	System.out.println("The Linkedlist is "+ linkedList);
	
	//Provide value to Index position
	linkedList.add(1, 200);
	System.out.println("The Index 1 is "+ linkedList);
	
	//Print the 3rd element
	
	System.out.println("The third Element is "+linkedList.get(3));
	
	//Remove the 2nd Element
	linkedList.remove(1);
	System.out.println(linkedList);
	
	for (Integer integer : linkedList) {
		System.out.println(integer);
		
	}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList Test = new LinkedList();
		Test.LinkedListt();
	}

}
