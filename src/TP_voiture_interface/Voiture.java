package TP_voiture_interface;

public abstract class Voiture extends Vehicule implements iConfortable{
	
	private String modele;

	public Voiture(String modele) {
		super();
		this.modele = modele;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Voiture [modele=" + modele + "]";
	}
	

}
