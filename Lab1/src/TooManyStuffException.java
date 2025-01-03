/*
 * Too Many Stuff Exception class
 * 
 * @author Westin Gjervold
 */
@SuppressWarnings("serial")
public class TooManyStuffException extends Exception{
	protected String message;
	// Constructor with no parameters
	public TooManyStuffException() {
        message = "Too many stuff!";
    }
	// Constructor with a single parameter of type String
    public TooManyStuffException(String exceptionMessage) {
        message = exceptionMessage;
    }
    // Exception message method
    public String getTooManyMessage() {
        return message;
    }
}
