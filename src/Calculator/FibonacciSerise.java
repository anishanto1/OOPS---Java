package Calculator;

import java.util.Scanner;

public class FibonacciSerise {

	public static void main(String[] args) {		

		//create a Scanner object to read user input from the console
		Scanner scanner = new Scanner(System.in);

		//For Intimating the User to Provide the number to calculate FibonacciSerise
		System.out.println(" Enter the numbers for FibonacciSerise :");

		//For User's to Provided value on console
		int n = scanner.nextInt();

		//Variable Declaration
		int firstterm = 0;
		int secondterm = 1;

		System.out.println("Fibonacci Series:");

		//Condition will execute till "n"
		for (int i = 0; i <=n; i++) {
			System.out.print(firstterm + " ");

			
			int nexterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm= nexterm;
		}


	}

}
