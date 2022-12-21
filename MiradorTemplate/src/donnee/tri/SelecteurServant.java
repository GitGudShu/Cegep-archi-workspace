package donnee.tri;

import java.util.List;

import modele.Servant;

public class SelecteurServant {
	
	List<Servant> servantsAvantTri = null;
	List<Servant> servantsChoisis = null;
	
	public SelecteurServant(List<Servant> servants)
	{
		this.servantsAvantTri = servants;
	}
	
	public void executer()
	{
		List<Servant> servantsSelonRarete = this.trierSelonRarete(this.servantsAvantTri);
		List<Servant> servantsSelonForce = this.trierSelonForce(servantsSelonRarete);
		this.servantsChoisis = this.trierSelonVie(servantsSelonForce);
	}
	
	public List<Servant> trierSelonRarete(List<Servant> servants)
	{
		return servants;
	}
	
	public List<Servant> trierSelonForce(List<Servant> servants)
	{
		return servants;
	}
	
	public List<Servant> trierSelonVie(List<Servant> servants)
	{
		return servants;
	}

	public List<Servant> getServantsChoisis() {
		return servantsChoisis;
	}
		
	
}
