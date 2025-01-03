import java.util.Random;
import java.util.Scanner;
/*
 * Lab 1 Task 2
 * 
 * @author Westin Gjervold
 */
public class Lab1Task2 {
	public static void main(String args[]) {
		//Creates an array with 100 randomly chosen integers.
		int[] array = new int[100];
		Random randNum = new Random();
		for(int i = 0; i < 100; i++) {
			array[i] = randNum.nextInt(100);
		}
		//Prompts the user to enter the index of the array
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter an index in the array: ");
		int index = userInput.nextInt();
		userInput.close();
		//Displays the corresponding element value
		try {
		System.out.println("Value at index "+ index +" is "+ array[index]);
		}
		//If the specified index is out of bounds, display the message Out of Bounds.
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
	}
}
