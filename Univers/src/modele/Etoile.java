package modele;

public class Etoile {
	
	protected String nom;
	protected float masse;
	protected float diametre;
	protected float luminosite;
	protected float temperature;
	
	
	
	public Etoile() {
		this.nom = "Etoile inconnue";
	}

	public Etoile(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public float getMasse() {
		return masse;
	}

	public void setMasse(float masse) {
		this.masse = masse;
	}

	public float getDiametre() {
		return diametre;
	}

	public void setDiametre(float diametre) {
		this.diametre = diametre;
	}

	public float getLuminosite() {
		return luminosite;
	}

	public void setLuminosite(float luminosite) {
		this.luminosite = luminosite;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	
}
