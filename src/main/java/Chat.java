
public class Chat extends Animaux {

	private String TypeAnimaux;
	private String Nom;

	public Chat(String typeAnimaux, String nom) {
		this.TypeAnimaux = typeAnimaux;
		this.Nom = nom;
	}

	@Override
	public String getTypeAnimaux() {

		return this.TypeAnimaux;
	}

	@Override
	public String getNom() {

		return this.Nom;
	}

}
