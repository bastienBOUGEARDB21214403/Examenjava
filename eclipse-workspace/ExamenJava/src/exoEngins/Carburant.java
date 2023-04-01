package exoEngins;

public class Carburant {
	private int nbCarburantS = 3;
	
	public String nom(int id) {
		switch (id) {
		case 0:
			return "gazole";
		case 1:
			return "essence";
		case 2:
			return "ethanol";
			
		}
		return "";
	}
	
	private double getConso(int carbu) {
		switch (carbu) {
		case 0:
			return 49.3;
		case 1:
			return 47.1;
		case 2:
			return 44.3;
		}
		return 0;
	}

	public int getNbCarburantS() {
		return nbCarburantS;
	}
	
	
	


}
