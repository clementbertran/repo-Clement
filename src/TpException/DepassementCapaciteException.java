package TpException;

public class DepassementCapaciteException extends Exception {
	
	private String message;

	public DepassementCapaciteException(String message) {
			this.message=message;
	}

	public DepassementCapaciteException() {
		this.message = "Bien joué vous avez dépassé la capacité de votre calculatrice !";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepassementCapaciteException [message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	

}
