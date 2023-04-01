package exoEngins;

public abstract class Engin extends Propulsion{
	private int dernierId = 0;
	private int id;
	private Propulsion propulsion;
	public Engin() {
		super();
	}
	
	
	
	public Propulsion getPropulsion() {
		return propulsion;
	}



	public void setPropulsion(Propulsion propulsion) {
		this.propulsion = propulsion;
	}



	public void Conduire(){
		
	}

	public int getDernierId() {
		return dernierId;
	}

	public void setDernierId(int dernierId) {
		this.dernierId = dernierId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Engin [dernierId=" + dernierId + ", id=" + id + "]";
	}
	
}
