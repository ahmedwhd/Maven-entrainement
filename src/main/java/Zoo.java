import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private static final int limiteVisieurs = 15;
	private int nbVisit;
	private int animauxSecteur;
	public static List<Secteur> secteursAnimaux;

	public Zoo() {
		this.nbVisit = 0;
		this.animauxSecteur = 0;
		secteursAnimaux = new ArrayList();
	}

	public void ajouterSecteur(String type) {
		Secteur secteur = new Secteur(type);
		secteursAnimaux.add(secteur);
	}

	public void nouveauVisiteur() throws Exception {
		if (nbVisit < limiteVisieurs)
			nbVisit++;
		else if (nbVisit == limiteVisieurs)
			throw new IllegalArgumentException("Zoo plein");
	}

	public int getLimiteVisiteur() {
		return limiteVisieurs;
	}

	public int getNombreVisiteur() {
		return nbVisit;
	}

	public void nouvelAnimal(String type, String nom) {

		if (type == "Chat") {
			Chat chat = new Chat(type, nom);
			System.out.println("type = chat");

			for (Secteur i : secteursAnimaux) {
				System.out.println(i.obtenirType());
				if (i.obtenirType() == "Chat") {
					System.out.println("ajout" + i.obtenirType());
					i.ajouterAnimal(chat);
					animauxSecteur++;
				}
			}
		} else if (type == "Chien") {
			System.out.println("type = chat");
			Chien chien = new Chien(type, nom);

			for (Secteur i : secteursAnimaux) {
				System.out.println(i);
				if (i.obtenirType().compareTo("Chien") == 0) {
					i.ajouterAnimal(chien);
					animauxSecteur++;
				}
			}
		}
	}

	public int nombreAnimaux() {
		int count = 0;
		for (Secteur secteur : secteursAnimaux) {
			count += secteur.getNombreAnimaux();
		}
		return count;
	}

	public void AfficherSecteurs() {
		for (Secteur secteur : secteursAnimaux) {
			System.out.println(secteur.obtenirType());
		}

	}

	public void AfficherAnimaux() {
		for (Secteur secteur : secteursAnimaux) {
			System.out.println(secteur.obtenirType());
			secteur.AfficherAnimal();
		}

	}

	public static void main(String[] args) {

		Zoo zoo1 = new Zoo();

		// zoo1.ajouterSecteur("Oiseau");
		zoo1.ajouterSecteur("Chat");
		zoo1.ajouterSecteur("Chien");
		zoo1.AfficherSecteurs();
		System.out.println(zoo1.animauxSecteur);
		zoo1.nouvelAnimal("Chat", "felix");
		// zoo1.nouvelAnimal("Chat", "miiinou");
		// zoo1.nouvelAnimal("Chat", "bassa");
		System.out.println(zoo1.animauxSecteur);
		try {
			zoo1.nouveauVisiteur();
			zoo1.nouveauVisiteur();
		} catch (Exception e) {
			e.printStackTrace();
		}

		zoo1.AfficherAnimaux();

		// System.out.println(zoo1.getNombreVisiteur());

	}

}
