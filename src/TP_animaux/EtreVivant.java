package TP_animaux;

public abstract class EtreVivant implements IVivant{
	
	
	public abstract void naitre();
	
	public void seDeplacer() {
		
		System.out.println("Se déplace par défaut en avant");
		
	}

}
