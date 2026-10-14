package controleur;

import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public int acheterProduitMarche(String nomClient, String nomVendeur, String produit, int nbAchat) {
		int quantiteAchetee = -1;
		if ((controlVerifierIdentite.verifierIdentite(nomVendeur) == false) || (controlVerifierIdentite.verifierIdentite(nomClient) == false)) {
			return quantiteAchetee;
		} else {
			controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur).acheterProduit(nbAchat);
		}
		return quantiteAchetee;
	}
	
	public String[] isProduit (String produit) {
		String[] vendeurs = null;
		int compteur = 0;
		 String[] detailsEtal = village.donnerEtatMarche();
		 for (int i = 0; i<village.donnerNbEtal(); i = i + 3) {
			 if (detailsEtal[i+2].equals(produit)) {
				 vendeurs[compteur] = detailsEtal[i];
				 compteur++;
			 }
		 }
		 return vendeurs;
	}
}
