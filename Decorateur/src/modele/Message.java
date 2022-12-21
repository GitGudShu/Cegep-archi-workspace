package modele;

public class Message {
	
	protected String texte;
	protected String auteur;
	
	public Message() {
		super();
	}
	public Message(String texte) {
		super();
		this.texte = texte;
	}
	public Message(String texte, String auteur) {
		super();
		this.texte = texte;
		this.auteur = auteur;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	

}