import java.security.ProtectionDomain;

import modele.Etoile;

public class App {

	public static void main(String[] args) {
		Etoile soleil = new Etoile();
		
		soleil.setDiametre(100000);
		soleil.setNom("Soleil");
		
		System.out.println("Le " + soleil.getNom() + " a un diametre de " + soleil.getDiametre());
		
		Etoile sirius = new Etoile("Sirius");
		
		System.out.println("L'étoile s'appelle " + sirius.getNom());
	    
		// https://www.fishwatch.gov/api/species
		// https://www.thecocktaildb.com/api/json/v1/1/random.php
		// https://api.atlasacademy.io/export/NA/basic_svt.json
		// https://api.atlasacademy.io/export/NA/basic_equip.json
	}
	
}