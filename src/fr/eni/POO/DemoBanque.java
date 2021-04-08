package fr.eni.POO;
public class DemoBanque {

	public static void main(String[] args) {
		
		
		Banque banqueBnp = new Banque("BNP", "Quimper", "Logo",500000);
		// banqueBnp.valeurEnBourse = 100; plus possible car private

		banqueBnp.setVille("Mauron");
		System.out.println(banqueBnp.getInfos());
		System.out.println(banqueBnp.getVille());
		

		System.out.println(banqueBnp);

		System.out.println("helloBanque");

	}

}
