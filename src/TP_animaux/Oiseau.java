package TP_animaux;

public class Oiseau extends EtreVivant implements ISiffleur{

	@Override
	public void seDeplacer() {
		
		voler();
		
	}

	@Override
	public void seNourrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void communiquer() {
		// TODO Auto-generated method stub
		
	}
	
	private void voler() {
		
		System.out.println("se déplace en volant");
		
	}

	@Override
	public void siffler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void naitre() {
		// TODO Auto-generated method stub
		
	}

}
