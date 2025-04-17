package Abstraction;


//Using Inheritance Here
public class Audi extends car {

	@Override
	public void EngineSecret() {
		System.out.println("Audi's Engine Secret");
	}
	@Override
	public void CarPrice() {
		System.out.println("Audi's Price");
	}

	public static void main(String[] args) {

		//Applying Dynamic Polymorphism
		//Parentclass object = new child class()

		car car = new Audi();
		car.EngineSecret();
		car.CarPrice();



	}

}
