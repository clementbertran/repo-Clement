package fr.eni.POO;
public class Banque {
	
	private static String pays;
	private String nom;
	private String ville;
	private String logo;
	private long valeurEnBourse;
	

	public Banque () {
		
	}
	
	
	public Banque(String nom, String ville, String logo, long valeurEnBourse) {
		super();
		this.nom = nom;
		this.ville = ville;
		this.logo = logo;
		this.valeurEnBourse = valeurEnBourse;
		pays = "France";
	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}


	public long getValeurEnBourse() {
		return valeurEnBourse;
	}


	public void setValeurEnBourse(long valeurEnBourse) {
		this.valeurEnBourse = valeurEnBourse;
	}
	
	





	@Override
	public String toString() {
		return "Banque [nom=" + nom + ", ville=" + ville + ", logo=" + logo + ", valeurEnBourse=" + valeurEnBourse
				+ "]";
	}


	public String getInfos() {
		
		String returnValue =  this.nom + " " + this.ville + " " + this.logo + " " + this.valeurEnBourse;
		
		return returnValue;
	}


	public static String getPays() {
		return pays;
	}

}
