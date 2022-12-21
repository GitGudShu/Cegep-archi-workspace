package donnee.tri;

import java.util.ArrayList;
import java.util.List;

import modele.Servant;

public class SelecteurServantsSSR extends SelecteurServant{
	
	public SelecteurServantsSSR(List<Servant> servants) {
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
}
