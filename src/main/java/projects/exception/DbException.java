package projects.exception;

//Our constructors will help turn checked exceptions into unchecked exceptions. 
//1.  In the projects.exception package, create a class named "DbException". This class must extend RuntimeException. 
//		Override the following constructors from the superclass:
//2.  Be sure to call the matching constructor in the superclass from each constructor in DbException
//		These are called by using "super".

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException() {
		
	}

	public DbException(String message) {
		super(message);
		
	}

	public DbException(Throwable cause) {
		super(cause);
		
	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
		
	}



}
