package Gourmandise;

public class Viennoiserie {

	private int prix;
	private int taille;
	private int qteBeurre;
	private String nomBoulanger;
	private Personne acheteur;

	public Viennoiserie(int prix, int taille, int qteBeurre, String nomBoulanger) {
		super();
		this.prix = prix;
		this.taille = taille;
		this.qteBeurre = qteBeurre;
		this.nomBoulanger = nomBoulanger;

	}

	/**
	 * Quantité de beuerre par defaut.
	 * 
	 * @param prix
	 * @param taille
	 * @param nomBoulanger
	 */
	public Viennoiserie(int prix, int taille, String nomBoulanger) {
		super();
		this.prix = prix;
		this.taille = taille;
		this.qteBeurre = 200;
		this.nomBoulanger = nomBoulanger;

	}
	

	public Personne getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Personne acheteur) {
		this.acheteur = acheteur;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getQteBeurre() {
		return qteBeurre;
	}

	public void setQteBeurre(int qteBeurre) {
		this.qteBeurre = qteBeurre;
	}

	public String getNomBoulanger() {
		return nomBoulanger;
	}

	public void setNomBoulanger(String nomBoulanger) {
		this.nomBoulanger = nomBoulanger;
	}

	public void estMangee() {
		System.out.println("miam miam c'est pas mauvais !");
	}

	@Override
	public String toString() {
		return "Viennoiserie [prix=" + prix + ", taille=" + taille + ", qteBeurre=" + qteBeurre + ", nomBoulanger="
				+ nomBoulanger + "]";
	}

}
