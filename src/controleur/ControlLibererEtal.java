package controleur;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean isVendeur (String nomVendeur) {
		if (controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur) != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param nomVendeur
	 * @return donneesEtal est un tableau de chaine contenant
	 * 		[0] : un boolean indiquant si l'étal est occupé
	 * 		[1] : nom du vendeur
	 * 		[2] : produit vendu
	 * 		[3] : quantité de produit à vendre au début du marché
	 * 		[4] : quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		String[] donneesEtal = new String[5];
		String[] etat = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur).etatEtal();
		donneesEtal[0] = etat[0];
		donneesEtal[1] = etat[1];
		donneesEtal[2] = etat[2];
		donneesEtal[3] = etat[3];
		donneesEtal[4] = etat[4];
		return donneesEtal;
	}

}
