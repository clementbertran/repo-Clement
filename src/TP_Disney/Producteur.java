package TP_Disney;

import java.util.ArrayList;
import java.util.List;

public class Producteur {
	
	private String nom;
	private String nationalité;
	
	private List<Film> films;

	public Producteur(String nom, String nationalité) {
		super();
		this.nom = nom;
		this.nationalité = nationalité;
		this.films = new ArrayList<Film>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNationalité() {
		return nationalité;
	}

	public void setNationalité(String nationalité) {
		this.nationalité = nationalité;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public void ajoutFilm(Film film) {
		this.films.add(film);
	}
	
	public void enleveFilm(Film film) {
		this.films.remove(film);
	}

}
