package JavaCollections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {

	public void ArrayListt() {

		//Insert values to ArrayList
		//ArrayList<String>();
		//<> its called generic which is used to fore mention the types 

		List<String> arraylist = new java.util.ArrayList<String>();

		//Add values to arraylist
		//Use add class

		arraylist.add("Benz");
		arraylist.add("BMW");
		arraylist.add("Skoda");
		arraylist.add("Innova");

		System.out.println(arraylist);

		//Retrive values from arrayList
		//get(index)
		//indexof()
		//lastindex()
		//expected value is not available in the list means it will show -1

		System.out.println(arraylist.get(3));
		System.out.println(arraylist.indexOf("Innova"));
		System.out.println(arraylist.lastIndexOf("BMW"));
		System.out.println(arraylist.indexOf("Kwid"));

		//Copy the values to another one list
		//addAll()

		List<String> Anotherlist = new java.util.ArrayList<>();
		Anotherlist.addAll(arraylist);
		System.out.println(Anotherlist);

		//Clear the List
		Anotherlist.clear();
		System.out.println(Anotherlist);

		//Remove the values from ArrayList
		//Remove by index()
		//Remove by value (string)

		arraylist.remove(0);
		System.out.println(arraylist);

		arraylist.remove("Skoda");
		System.out.println(arraylist);

		//Add null value

		arraylist.add(null);
		System.out.println(arraylist);	

		//Update the value to existing list item

		arraylist.set(2, "Ranault");
		System.out.println(arraylist);

		//Check the Array is empty or not ?

		System.out.println(arraylist.isEmpty());

		//Print all the values by Foreach statement

		for (String string : arraylist) {
			System.out.println("Print all the values by foreach : " + string);
		}

		//Print all the values by for statement
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println("Print all the values by for : " + arraylist);
		}

		//Print all the values by ListIterator
		//hasNext();
		//hasPrevious();

		ListIterator<String>	iterator = arraylist.listIterator();

		//hasNext();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());  
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Test = new ArrayList();
		Test.ArrayListt();



	}

}
