package Gourmandise;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	
	private String nom;
	//private Viennoiserie aliment;
	private List<Viennoiserie>  viennoiseries;
	
	
	public Personne() {
		this.viennoiseries = new ArrayList<Viennoiserie>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	


	public List<Viennoiserie> getViennoiseries() {
		return viennoiseries;
	}

	public void setViennoiseries(List<Viennoiserie> viennoiseries) {
		this.viennoiseries = viennoiseries;
	}

	public void acheter(Viennoiserie aliment) {
		
		if (aliment.getAcheteur()==null) {
		aliment.setAcheteur(this);
		//this.aliment = aliment;
		this.viennoiseries.add(aliment);
		}else {
			System.out.println("article deja vendu");
		}
	}
	
	public boolean manger(Viennoiserie aliment) {
		if (viennoiseries.contains(aliment)) {
			System.out.println("Je mange un aliment des plus sain : "+aliment.getClass().getSimpleName());
			viennoiseries.remove(aliment);
			aliment = null;
			return true;
		}else{
			System.out.println("Il n'y a pas d'abonnés a ce numéro !");
			return false;
		}
		//System.out.println("Je mange un aliment des plus sain : "+this.aliment.getClass().getSimpleName());
	}

}
