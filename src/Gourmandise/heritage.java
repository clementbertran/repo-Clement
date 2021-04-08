package Gourmandise;

public class heritage {

	public static void main(String[] args) {

		Viennoiserie viennois = new Viennoiserie(2, 12, 50, "René");
		Viennoiserie croissant = new Croissant(3, 15, 150, "Richard");
		Chocolatine choco = new Chocolatine(4, 10, 180, "Pierre");
		Viennoiserie raisin = new painAuxRaisins(5, 15, "Anne");

		System.out.println(croissant.toString());
		System.out.println(choco.toString());
		System.out.println(raisin);

		((Croissant) croissant).préparerCroissantEnRoulantLaPate();
		choco.estMangee();
		raisin.estMangee();

		Personne Jean = new Personne();
		Jean.acheter(croissant);
		System.out.println(Jean.getViennoiseries());
		Jean.manger(croissant);
		Jean.manger(croissant);

		System.out.println(croissant.getAcheteur().getClass().getSimpleName());

		Personne Paul = new Personne();
		Paul.acheter(croissant);
		Paul.acheter(raisin);
		Paul.manger(raisin);

	}

}
