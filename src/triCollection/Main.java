package triCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		AdresseIp ipA = new AdresseIp(1, "192.168.1.");
		AdresseIp ipB = new AdresseIp(2, "192.168.1.");
		AdresseIp ipC = new AdresseIp(3, "192.168.1.");
		AdresseIp ipD = new AdresseIp(4, "192.168.1.");

		List<AdresseIp> liste = new ArrayList<>();
		liste.add(ipC);
		liste.add(ipD);
		liste.add(ipA);
		liste.add(ipB);

		Collections.sort(liste);

		System.out.println(ipD.divisionIp(2));

		System.out.println(ipD.divisionIp(0));

		System.out.println(ipD.divisionIp(3));

		liste.forEach(a -> System.out.println(a.getNumeroHote()));

	}

}
