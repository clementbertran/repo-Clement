package TP_voiture_interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iPilotable clio = new Renault("Clio");
		Voiture c3 =new Citroen ("C3");
		iPilotable yamaha = new Yamaha();
		iConfortable laguna = new Renault("Laguna");
		
		List<iPilotable> liste = new ArrayList<iPilotable>();
		
		c3.reculer();
		clio.rouler();
		clio.toString();

	}

}
