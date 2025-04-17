package DynamicPolymorphism;

public class sub1 extends main{


	//OverRiding
	//Property 2 is the method which is already available in main (parent class) 
	//Even we are changing the Values 
	@Override
	public void Property2() {

		System.out.println("OverRidded New Property");

	}

	public static void main(String[] args) {

		//Parentcalss ref = new child class()
		main newmain = new sub1();

		newmain.Property1(); 

		//calling overridded class

		newmain.Property2();



	}

}
