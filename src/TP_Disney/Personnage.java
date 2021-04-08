package TP_Disney;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
	
	private String nom;
	private Caractere carctère; //gentil/mechant
	private List<Film> films;
	
	public Personnage(String nom, Caractere carctère) {
		super();
		this.nom = nom;
		this.carctère = carctère;
		this.films = new ArrayList<Film>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Caractere getCarctère() {
		return carctère;
	}

	public void setCarctère(Caractere carctère) {
		this.carctère = carctère;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", carctère=" + carctère + ", films=" + films + "]";
	}

	public void addFilms(Film film) {
		this.films.add(film);
		
	}
	

}
