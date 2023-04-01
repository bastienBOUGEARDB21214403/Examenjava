package exoEngins;

public class Thermique extends Propulsion{
	private static double perte = 64.0;
	private int carburant;
	private double masse = 1;
	public Thermique(int carburant, double masse) {
		super();
		this.carburant = carburant;
		this.masse = masse;
	}
	
	public double consommerEnergie(){
		return carburant;	
	}

	public static double getPerte() {
		return perte;
	}

	public static void setPerte(double perte) {
		Thermique.perte = perte;
	}

	public int getCarburant() {
		return carburant;
	}

	public void setCarburant(int carburant) {
		this.carburant = carburant;
	}

	public double getMasse() {
		return masse;
	}

	public void setMasse(double masse) {
		this.masse = masse;
	}

	@Override
	public String toString() {
		return "Thermique [carburant=" + carburant + ", masse=" + masse + "]";
	}
	
	
	
	
	
	
	
	

}
