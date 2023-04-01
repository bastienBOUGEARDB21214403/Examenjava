package cinema;

import java.util.Objects;

public class Film {

	private String titre;
	private int duree;
	public Film(String titre, int duree) {
		super();
		this.titre = titre;
		this.duree = duree;
	}
	public int getDuree() {
		return duree;
	}
	@Override
	public String toString() {
		return "Film [titre=" + titre + ", duree=" + duree + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(duree, titre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return duree == other.duree && Objects.equals(titre, other.titre);
	}
	
}
