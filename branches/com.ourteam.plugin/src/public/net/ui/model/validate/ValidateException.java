package net.ui.model.validate;

public class ValidateException extends Exception {

	public ValidateException() {
		super();
	}

	public ValidateException(String message) {
		super(message);
	}

	public ValidateException(Throwable cause) {
		super(cause);
	}

	public ValidateException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ValidateException(ErrorMessages aErrorMessage){
		super( aErrorMessage.getErrorMessages() );
	}

}
