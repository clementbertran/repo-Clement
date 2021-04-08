package Gourmandise;

public class painAuxRaisins extends Viennoiserie{

	public painAuxRaisins(int prix, int taille, int qteBeurre, String nomBoulanger) {
		super(prix, taille, qteBeurre, nomBoulanger);
		// TODO Auto-generated constructor stub
	}
	public painAuxRaisins(int prix, int taille, String nomBoulanger) {
		super(prix, taille, nomBoulanger);
		// TODO Auto-generated constructor stub
	}
	
	public void glisserDesOlives() {
		System.out.println("pourquoi pas ?");
	}
	
	public void estMangee () {
		System.out.println("C'est imonde !");
	}
	
	

}
