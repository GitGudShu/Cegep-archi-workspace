package donnee;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import modele.Servant;

public class ServantDAO extends ServiceDAO{
	
	public List<Servant> simulerListeServants()
	{
		// mockup de données pour Servant
		
		List<Servant> servants = new ArrayList<Servant>();
		servants.add(new Servant(1, "Lion King", "Arthur Pendragon", "Saber", 5, 12000, 10000, "https://i1.sndcdn.com/avatars-000321450633-9wlivc-t500x500.jpg"));
		return servants;
	}
	
	public List<Servant> listerServants()
	{
		System.out.println("ServantDAO.listerServants()");
		List<Servant> servants = new ArrayList<Servant>();
		
		// Aller chercher le flux de données sur internet
		
		String SOURCE = "https://api.atlasacademy.io/export/JP/basic_servant_lang_en.json";
		String jsonServant = telechargerDonnees(SOURCE);
		
		// Parser les données recues en JSON
		
		Servant servant;
		
		JSONArray arrayDocument = new JSONArray(jsonServant);
		JSONObject document;
		
		System.out.println("taille du document JSON : " + arrayDocument.length());
		
		for(int i = 0 ; i < arrayDocument.length(); i++) {
			servant = new Servant();
			document = arrayDocument.getJSONObject(i);
		
			// Vérification des données
			
			System.out.println("============= NOUVEAU SERVANT =============");
			
			System.out.println(document.getInt("collectionNo"));
			System.out.println(document.getString("name"));
			System.out.println(document.getString("originalName"));
			System.out.println(document.getString("className"));
			System.out.println(document.getInt("rarity"));
			System.out.println(document.getInt("atkMax"));
			System.out.println(document.getInt("hpMax"));
			System.out.println(document.getString("face"));
			
			// Affectation des données à une instance
			// Essai des opérations ternaires
			
			servant.setId(document.getInt("collectionNo"));
			String nomServant = (document.getString("name") == null)?"":document.getString("name");
			servant.setNom(nomServant);
			String nomOriginalServant = (document.getString("originalName") == null)?"":document.getString("originalName");
			servant.setNomOriginal(nomOriginalServant);
			String nomClasse = (document.getString("className") == null)?"":document.getString("className");
			servant.setNomClasse(nomClasse);
			servant.setRarete(document.getInt("rarity"));
			servant.setAtqMax(document.getInt("atkMax"));
			servant.setPvMax(document.getInt("hpMax"));
			String visageServant = (document.getString("face") == null)?"":document.getString("face");
			servant.setPhoto(visageServant);
		
			servants.add(servant);
		}
		
		return servants;
	}
	
	public List<Servant> listerServantAuHasard()
	{
		System.out.println("ServantDAO.listerServantAuHasard()");
		List<Servant> servants = new ArrayList<Servant>();
		servants.add(listerServants().get((int)(Math.random()*364)));
		return servants;
	}
	
	public List<Servant> listerSpecificServant(int idServant)
	{
		System.out.println("ServantDAO.listerSpecificServant()");
		List<Servant> servants = new ArrayList<Servant>();
		servants.add(listerServants().get(idServant));
		return servants;
	}

}
