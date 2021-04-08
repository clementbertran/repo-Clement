package TpException;

public class Operation {
	
	public int ajouter(int a, int b) throws DepassementCapaciteException{
		try {
		return a+b;
		}catch(Exception e){
			throw new DepassementCapaciteException();
		}
	}
	
	public int soustraire(int a, int b) throws DepassementCapaciteException {
		try {
		return a-b;
		}catch(Exception e) {
			throw new DepassementCapaciteException();
		}
	}
	
	public int multiplier(int a, int b) throws DepassementCapaciteException{
		try {
		return a*b;
		}catch(Exception e) {
			throw new DepassementCapaciteException();
		}
	}

}
