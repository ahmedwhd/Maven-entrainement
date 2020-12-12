import java.util.ArrayList;
import java.util.List;

public class Secteur {

	private String TypeAnimaux;
	public static List<Animaux> animauxSecteur;

	public Secteur(String typeAnimaux) {
		TypeAnimaux = typeAnimaux;
		animauxSecteur = new ArrayList();
	}

	public void ajouterAnimal(Animaux anim) {
		/*
		 * if (anim.getTypeAnimaux().compareTo(TypeAnimaux) == 0)
		 * animauxSecteur.add(anim);
		 */

		if (anim.getTypeAnimaux() != TypeAnimaux) {
			throw new IllegalArgumentException("mauvais secteur");
		}
		animauxSecteur.add(anim);
	}

	public int getNombreAnimaux() {
		return animauxSecteur.size();
	}

	public String obtenirType() {
		return TypeAnimaux;
	}

	public void AfficherAnimal() {

		for (Animaux animaux : animauxSecteur) {

			System.out
					.println("Nom de l'animal: " + animaux.getNom() + " Type de l'animal: " + animaux.getTypeAnimaux());
		}
	}

}
