package controleur;


import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.ServantDAO;
import modele.Servant;
import vue.VueServant;

public class ControleurServant extends Controleur {

	public ControleurServant()
	{
		Logger.logMsg(Logger.INFO, "new ControleurServants()");
	}
	public void initialiser()
	{
		VueServant vue = VueServant.getInstance();
		
		ServantDAO dao = new ServantDAO();
		//dao.listerServants(); // appel pour tester execution
		
		// Récupérer la liste de Servants avec différentes fonctions du DAO
		
		//List<Servant> servants = dao.simulerListeServants();
		List<Servant> servants = dao.listerServantAuHasard();
		//List<Servant> servants = dao.listerSpecificServant(69);
		
		//vue.getInstance().testerServant();
		vue.afficherServants(servants);
	}

}
