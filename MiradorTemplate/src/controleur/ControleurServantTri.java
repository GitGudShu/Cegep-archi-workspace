package controleur;


import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.ServantDAO;
import donnee.tri.SelecteurServantsForts;
import donnee.tri.SelecteurServantsSSR;
import modele.Servant;
import vue.VueServantTri;

public class ControleurServantTri extends Controleur {

	public ControleurServantTri()
	{
		Logger.logMsg(Logger.INFO, "new ControleurServantsTri()");
	}
	public void initialiser()
	{
		VueServantTri vue = VueServantTri.getInstance();	
		ServantDAO dao = new ServantDAO();

		List<Servant> servants = dao.listerServants();
		
		vue.afficherListeServants(servants);
		vue.activerControles();
	}
	public void trierServantsSSR() {
		System.out.println("ControleurServantTri.trierSSR()");
		ServantDAO servantDAO = new ServantDAO();
		List<Servant> servants = servantDAO.listerServants();
		SelecteurServantsSSR selecteurServantSSR = new SelecteurServantsSSR(servants);
		selecteurServantSSR.executer();
		List<Servant> servantsSSR = selecteurServantSSR.getServantsChoisis();
		VueServantTri.getInstance().afficherListeServants(servantsSSR);
	}
	public void trierServantsForts() {
		System.out.println("ControleurServantTri.trierForce()");
		ServantDAO servantDAO = new ServantDAO();
		List<Servant> servants = servantDAO.listerServants();
		SelecteurServantsForts selecteurServantForts = new SelecteurServantsForts(servants);
		selecteurServantForts.executer();
		List<Servant> servantsForts = selecteurServantForts.getServantsChoisis();
		VueServantTri.getInstance().afficherListeServants(servantsForts);
	}
	public void reinitialiserListe() {
		ServantDAO dao = new ServantDAO();
		List<Servant> servants = dao.listerServants();
		VueServantTri.getInstance().afficherListeServants(servants);
	}

}
