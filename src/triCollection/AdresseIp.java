package triCollection;

public class AdresseIp implements Comparable<AdresseIp> {

	private int numeroHote;
	private String numReseau;

	public AdresseIp(int numeroHote, String numReseau) {
		super();
		this.numeroHote = numeroHote;
		this.numReseau = numReseau;
	}

	public int getNumeroHote() {
		return numeroHote;
	}

	public void setNumeroHote(int numeroHote) {
		this.numeroHote = numeroHote;
	}

	public String getNumReseau() {
		return numReseau;
	}

	public void setNumReseau(String numReseau) {
		this.numReseau = numReseau;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdresseIp [numeroHote=");
		builder.append(numeroHote);
		builder.append(", numReseau=");
		builder.append(numReseau);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(AdresseIp o) {
		if (this.numeroHote > o.numeroHote) {
			return 1;
		} else if (this.numeroHote < o.numeroHote) {
			return -1;
		} else {
			return 0;
		}

	}
	
	public Double divisionIp(int i){
		try {
		return (double) (this.getNumeroHote()/i);
		}
		catch(Exception e) {
			System.out.println("division par 0 impossible !");
		}
		return 0.0;
	}
}
