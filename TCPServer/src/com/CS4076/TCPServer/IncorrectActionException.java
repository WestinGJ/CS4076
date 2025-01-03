package com.CS4076.TCPServer;

/**
 * Exception class to handle improperly formatted action requests
 * 
 * @author Westin Gjervold
 * @author Samuel Schroeder
 */
@SuppressWarnings("serial")
public class IncorrectActionException extends Exception{
    public IncorrectActionException() {
        super("Incorrect action chosen.");
    }
    public IncorrectActionException(String msg) {
        super(msg);
    }
}
