package donnee.tri;

import java.util.ArrayList;
import java.util.List;

import modele.Servant;

public class SelecteurServantsForts extends SelecteurServant{
	
	public SelecteurServantsForts(List<Servant> servants) {
		super(servants);
	}
	
	public List<Servant> trierSelonRarete(List<Servant> servants)
	{
		List<Servant> servantsSSR = new ArrayList<Servant>();
		for(Servant servant : servants) {
			if(servant.getRarete() == 5)
				servantsSSR.add(servant);
		}
		return servantsSSR;
	}
	
	public List<Servant> trierSelonForce(List<Servant> servants)
	{
		List<Servant> servantsForts = new ArrayList<Servant>();
		for(Servant servant : servants) {
			if(servant.getAtqMax() > 10000)
				servantsForts.add(servant);
		}
		return servantsForts;
	}
	
	public List<Servant> trierSelonVie(List<Servant> servants)
	{
		List<Servant> servantsForts = new ArrayList<Servant>();
		for(Servant servant : servants) {
			if(servant.getPvMax() > 14000)
				servantsForts.add(servant);
		}
		return servantsForts;
	}
}
