import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * Lab 1 Task 1
 * 
 * @author Westin Gjervold
 */
public class Lab1Task1 {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
        int num1, num2, sum;
        boolean inputValid = false;
        while (!inputValid) {
        	//Prompts the user to read two integers and displays their sum
            try {
                System.out.print("Enter the first integer: ");
                num1 = userInput.nextInt();
                System.out.print("Enter the second integer: ");
                num2 = userInput.nextInt();
                sum = num1 + num2;
                System.out.println("Sum: " + sum);
                inputValid = true; 
            } 
            //Prompt the user to read the number again if the input is incorrect
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                userInput.next(); 
            }
        }
        userInput.close();
	}
}
