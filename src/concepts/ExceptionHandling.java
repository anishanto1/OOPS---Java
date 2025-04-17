package concepts;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Try block -- where we write code which may give run time exception
		//Catch Block - The place which handles the the EXCEPTION
		//e.printStackTrace(); -- To print Exception Handles 
		//A try block can have multiple Exception
		// ArithmeticException -- >Used to  ArithmeticException 

		try {

			int i= 0;
			int j = 1;
			int Div = j/i;
			System.out.println(Div);

		} 
		//Catch block will be only Print the values if its consist Exceptions
		//Catch block should not be work as Generic
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Number/zero (num/0)");
		}

		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("This is due to Null Pointer Exception");
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Number divided by zero is should not be handled ");

			//finally block --> which will be get executed even if the exceptions or occurred or not ?
		}	
		finally {
			System.out.println("Print even if Exception or Not");
		}

	}
}

