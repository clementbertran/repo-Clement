package TpException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws DepassementCapaciteException {

		Scanner scan = new Scanner(System.in);
		
		boolean bonNb = false;
		while (bonNb == false) {
			System.out.println("Saisir un nombre entier : ");

			try {
				int nb1 = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Il faut rentrer un nombre !");
				continue;
				
			} catch (Exception e) {
				throw new DepassementCapaciteException();
				
			}
			bonNb=true;
		}

	}

}
