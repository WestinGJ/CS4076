import java.util.Scanner;

/*
 * Lab 1 Task 4
 * 
 * @author Westin Gjervold
 */
public class Lab1Task4 {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Type a sentence that has fewer than 30 characters: ");
		String sentence = userInput.nextLine();
		userInput.close();
		try {
			if(sentence.length()>30 && sentence.length()<50) {
				throw new TooManyStuffException();
			}
			else if(sentence.length()>50) {
				throw new TooManyStuffException("Way too many stuff!");
			}
			else {
				System.out.println("Sentence is good length");
			}
		}
		catch(TooManyStuffException e) {
			System.out.println(e.getTooManyMessage());
		}
	}
}
