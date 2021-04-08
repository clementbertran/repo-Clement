package TP_animaux;

import java.util.ArrayList;
import java.util.List;

public class GroupeFelin <T extends EtreVivant>{
	
	private String race;
	private List<T> liste;
	

	public GroupeFelin(String race) {
		super();
		this.race = race;
		this.liste = new ArrayList<T>();
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public List<T> getListe() {
		return liste;
	}


	public void setListe(List<T> liste) {
		this.liste = liste;
	}


}
