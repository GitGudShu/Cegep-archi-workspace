
import java.util.List;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.ServantDAO;
import donnee.tri.SelecteurServantsForts;
import donnee.tri.SelecteurServantsSSR;
import modele.Servant;
import vue.VueServantTri;

public class App {

	public static void main(String[] parametres) {
		
		ServantDAO servantDAO = new ServantDAO();
		List<Servant> servants = servantDAO.listerServants();
		
		for(Servant servant : servants) {
			//System.out.println(servant.getNom() + " " + servant.getRarete() + " " + servant.getAtqMax());
		}
		
		SelecteurServantsForts selecteurServantForts = new SelecteurServantsForts(servants);
		selecteurServantForts.executer();
		List<Servant> servantsForts = selecteurServantForts.getServantsChoisis();
		
		SelecteurServantsSSR selecteurServantSSR = new SelecteurServantsSSR(servants);
		selecteurServantSSR.executer();
		List<Servant> servantsSSR = selecteurServantSSR.getServantsChoisis();
		
		System.out.println("===================================");
		
		for(Servant servant : servantsForts) {
			//System.out.println(servant.getNom() + " " + servant.getRarete() + " " + servant.getAtqMax()+ " " + servant.getPvMax());
		}
		
		System.out.println("===================================");
		
		for(Servant servant : servantsSSR) {
			//System.out.println(servant.getNom() + " " + servant.getRarete() + " " + servant.getAtqMax()+ " " + servant.getPvMax());
		}
		
		Controleur.choisirVuePrincipale(VueServantTri.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
