package frontiere;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		StringBuilder quelProduit = new StringBuilder();
		quelProduit.append("Quel produit voulez-vous acheter ?");
		String produit = Clavier.entrerChaine(quelProduit.toString());
		if (controlAcheterProduit.isProduit(produit) == null) {
			System.out.println("Désolé, personne ne vend ce produit au marché.");
		} else {
			StringBuilder quelVendeur = new StringBuilder();
			quelVendeur.append("Chez quel commerçant voulez-vous acheter des fleurs ?");
			for (int i=0; i<controlAcheterProduit.isProduit(produit).length; i++) {
				quelVendeur.append("- " + controlAcheterProduit.isProduit(produit)[i]);
			}
			int choixVendeur = Clavier.entrerEntier(quelVendeur.toString());
			String vendeur = controlAcheterProduit.isProduit(produit)[choixVendeur-1];
			StringBuilder nombreAchete = new StringBuilder();
			nombreAchete.append(nomAcheteur + " se déplace jusqu'à l'étal du vendeur " + vendeur + "\n Bonjour " + nomAcheteur + "\n Combien de " + produit + " voulez-vous acheter ?");
			int nbAchat = Clavier.entrerEntier(nombreAchete.toString());
			int produitAchete = controlAcheterProduit.acheterProduitMarche(nomAcheteur, vendeur, produit, nbAchat);
			if
		}
	}
}
