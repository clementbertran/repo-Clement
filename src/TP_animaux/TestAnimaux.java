package TP_animaux;

public class TestAnimaux {

	public static void main(String[] args) {
		
		Humain bill = new Humain();
		
		IVivant felix = new Chat();
		
		IVivant titi = new Oiseau();
		
		IVivant coco = new Oiseau();
		
		
		bill.seNourrir();
		felix.communiquer();
		titi.seDeplacer();
		bill.seDeplacer();
		felix.seDeplacer();
		
		GroupeFelin deLaSavane = new GroupeFelin<Lion>("");
		
		GroupeFelin duCanape = new GroupeFelin<Chat>("");
		

	}

}
