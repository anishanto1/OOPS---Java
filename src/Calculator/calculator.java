package Calculator;

import java.util.Scanner;

public class calculator {

	//Main Method
	public static void main(String[] args) {

		//create a Scanner object to read user input from the console
		Scanner scanner = new Scanner(System.in);

		//Variable Declarations
		int num1, num2;

		//To provide User Inputs
		System.out.println("Please Enter the First Number :");
		num1 = scanner.nextInt(); //Prompts the user to enter two numbers and reads them using

		System.out.println("Please Enter the Second Number :");
		num2 = scanner.nextInt();

		//Operation Selection for display a menu of four arithmetic operations 
		System.out.println("Choose Operations :");

		System.out.println("1.Addition [+]");
		System.out.println("2.Subtraction [-]");
		System.out.println("3.Multiplication [*]");
		System.out.println("4.Divison [/]");

		//To Read User's choice as Integers
		int choice = scanner.nextInt();

		//Switch statement to check the value of choices
		switch (choice) {

		case 1: 			
			System.out.println("Result :" + (num1+num2));
			break;

		case 2 :
			System.out.println("Result :" + (num1-num2));
			break;

		case 3 :
			System.out.println("Result :" + (num1*num2));
			break;

		case 4 :
			if (num2!=0)
			{
				System.out.println("Result :" + (num1/num2));
			}
			else {
				System.out.println("Provided values are not applicable for Divison ");
			}
			break;
			
		default:
			throw new IllegalArgumentException("Invalid Choice ");
		}
	}

}
