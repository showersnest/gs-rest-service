package hello.service;

public class InvalidWordException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6379316761669318726L;
	
	public InvalidWordException(Throwable throwable){
		super(throwable);
	}
	public InvalidWordException(String message, Throwable throwable){
		super(message, throwable);
	}
	public InvalidWordException(String message) {
		super(message);
	}
}
