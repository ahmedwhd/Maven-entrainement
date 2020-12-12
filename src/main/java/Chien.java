
public class Chien extends Animaux {

	private String TypeAnimaux;
	private String Nom;

	public Chien(String typeAnimaux, String nom) {
		this.TypeAnimaux = typeAnimaux;
		this.Nom = nom;
	}

	public String getTypeAnimaux() {

		return this.TypeAnimaux;
	}

	@Override
	public String getNom() {

		return this.Nom;
	}

}
