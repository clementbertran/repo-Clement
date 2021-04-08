package fr.eni.POO;

public class Client {

	private String nom;
	private String prenom;
	private int numeroDeCompte;
	
	
	public Client(String nom, String prenom, int numeroDeCompte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeCompte = numeroDeCompte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", numeroDeCompte=");
		builder.append(numeroDeCompte);
		builder.append("]");
		return builder.toString();
	}
	
	
	//coucou
	
	
	
}
