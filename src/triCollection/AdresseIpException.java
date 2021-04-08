package triCollection;

public class AdresseIpException extends Exception {
	
	private String message;
	private String codeErreur;
	
	public AdresseIpException(String message, String codeErreur) {
		super();
		this.message = message;
		this.codeErreur = codeErreur;
	}
	public AdresseIpException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCodeErreur() {
		return codeErreur;
	}
	public void setCodeErreur(String codeErreur) {
		this.codeErreur = codeErreur;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersoException [message=");
		builder.append(message);
		builder.append(", codeErreur=");
		builder.append(codeErreur);
		builder.append("]");
		return builder.toString();
	}
	 
	

}
