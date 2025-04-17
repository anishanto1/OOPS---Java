package JavaCollections;

public class TreeSet {

	public void TreeSett() {

		java.util.TreeSet<Integer> treeset = new java.util.TreeSet<Integer>();

		//It will follow ascending Order
		//Should not support null values 

		treeset.add(5);
		treeset.add(2);
		treeset.add(10);
		treeset.add(7);
		treeset.add(0);
		treeset.add(1);

		System.out.println(treeset);	

		//Print the First value by first()

		System.out.println("The First Value is :" + treeset.first());

		//Print the Last value by first()

		System.out.println("The Last Value is :" + treeset.last());

		//Headset() --> which is Use to retrieve less value than provided input value
		//It should not print the input value instead of it will remove the same

		System.out.println("The Headset Value is : " + treeset.headSet(5));

		//Tail set() --> which is Use to retrieve Higher value than provided input value

		System.out.println("The TailSet Value is : " + treeset.tailSet(5));

		//Sub set() --> which is Use to retrieve in between values of the  provided inputs

		System.out.println("The Subset Value is : " + treeset.subSet(0, 5));

		//Comparator will provide null value if sorting is in natural order

		System.out.println("The Comparator Value is :  "+ treeset.comparator());

		//Print Higher()
		System.out.println("To print Immediate Higher of of 2 : "+ treeset.higher(2));

		//Print lower()
		System.out.println("To print immediate lower of of 10 : "+ treeset.lower(10));

		//PollFirst() --> To print first Element
		System.out.println("Poll first Element : "+ treeset.pollFirst());

		//PollLast() -->To print Last Element
		System.out.println("TPoll Last Element: "+ treeset.pollLast());
		
		//After the Poll the provided input value should be get removed from the Set
		 System.out.println(treeset);
		 
		 //Print descending Order
		 System.out.println("Print Desending Order" + treeset.descendingSet());
		 
		//Print descending Order --> By descending Iterator
		 //It should be show Error Message
		 
		 System.out.println("Print Desending Order By descending Iterator " + treeset.descendingIterator());
		 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet test = new TreeSet();
		test.TreeSett();
	}

}
