package exoEngins;

public class Electrique extends Propulsion{
	private static double baseConso = 3.14;
	private static double perte = 62.0;
	private double masse = 1;
	
	
	public double consommerEnergie(){
		return masse;
	}


	public static double getBaseConso() {
		return baseConso;
	}


	public static void setBaseConso(double baseConso) {
		Electrique.baseConso = baseConso;
	}


	public static double getPerte() {
		return perte;
	}


	public static void setPerte(double perte) {
		Electrique.perte = perte;
	}


	public double getMasse() {
		return masse;
	}


	public void setMasse(double masse) {
		this.masse = masse;
	}


	@Override
	public String toString() {
		return "Electrique [masse=" + masse + "]";
	}
	
	
	

}
