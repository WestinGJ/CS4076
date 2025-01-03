import java.util.Scanner;

/*
 * Lab 1 Task 3
 * 
 * @author Westin Gjervold
 */
public class Lab1Task3 {
	public static void main(String args[]) {
		//Prompt the user for an input value
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = userInput.nextInt();
		userInput.close();
		//Try the Math.sqrt() method
		try {
			double sqrt = Math.sqrt(number);
			System.out.println("Square Root: " + sqrt);
		}
		//Catches the thrown Exception and displays an appropriate message.
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
