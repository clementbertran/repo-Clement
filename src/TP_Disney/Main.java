package TP_Disney;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Film robinDesBois = new Film("Robin des Bois", 1952, 100);
		Film leLivreDeLaJungle = new Film("Le Livre de la jungle", 1967, 90);
		Film leRoiLion = new Film("Le Roi lion", 1994, 120);

		Producteur disney = new Producteur("Dinsey", "USA");

		disney.ajoutFilm(leRoiLion);
		disney.ajoutFilm(leLivreDeLaJungle);
		disney.ajoutFilm(robinDesBois);

		disney.ajoutFilm(leRoiLion);
		disney.enleveFilm(leRoiLion);

		leRoiLion.ajouterPersonnage(new Personnage("Simba", Caractere.GENTIL));
		leRoiLion.ajouterPersonnage(new Personnage("Scar", Caractere.MACHIAVELIQUE));

		for (Film film : disney.getFilms()) {
			System.out.println(film.getTitre());
		}

		for (Personnage personnage : leRoiLion.getPersonnages()) {
			// System.out.println(personnage.getNom());
			if (personnage.getNom().equals("Simba")) {
				System.out.println(personnage.getFilms());
			}
		}

	}

}
