package cinema;

public class Spectateur {
	private String nom;
	public String filmsVus;
	
	

	public Spectateur(String nom) {
		super();
		this.nom = nom;
	}



	public String getFilmsVus() {
		return filmsVus;
	}
	
	private double getReduction() {
		return 0.1;
	}



	@Override
	public String toString() {
		return "Spectateur [nom=" + nom + ", filmsVus=" + filmsVus + "]";
	}
	
	private String getStringReduction() {
		return nom + "a 10%";
 
	}
	

}
