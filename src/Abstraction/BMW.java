package Abstraction;

public class BMW extends car{

	@Override
	public void EngineSecret() {
		System.out.println("BMW's Engine Secret");
	}
	@Override
	public void CarPrice() {
		System.out.println("BMW's Price");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Applying Dynamic Polymorphism
		//Parentclass object = new child class()

		car car = new BMW();
		car.CarPrice();
		car.EngineSecret();

	}

}
