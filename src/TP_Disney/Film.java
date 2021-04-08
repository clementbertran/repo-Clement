package TP_Disney;

import java.util.ArrayList;
import java.util.List;

public class Film {
	
	private String titre;
	private int anneeSortie;
	private int dureeEnMinute;
	private List<Personnage> personnages;
	
	public Film(String titre, int anneeSortie, int dureeEnMinute) {
		super();
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.dureeEnMinute = dureeEnMinute;
		this.personnages = new ArrayList<Personnage>();
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	public int getDureeEnMinute() {
		return dureeEnMinute;
	}

	public void setDureeEnMinute(int dureeEnMinute) {
		this.dureeEnMinute = dureeEnMinute;
	}
	
	

	public List<Personnage> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
	}

	@Override
	public String toString() {
		return "Film [titre=" + titre + ", anneeSortie=" + anneeSortie + ", dureeEnMinute=" + dureeEnMinute + "]";
	}
	public void ajouterPersonnage (Personnage personnage) {
		personnages.add(personnage);
		personnage.addFilms(this);
	}

}
