package Gourmandise;

public class Croissant extends Viennoiserie {

	public Croissant(int prix, int taille, int qteBeurre, String nomBoulanger) {
		super(prix, taille, qteBeurre, nomBoulanger);
		
	}
	
	public void préparerCroissantEnRoulantLaPate() {
		System.out.println("Je fais de bon croissants !");
	}

}
