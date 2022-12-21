package modele;

public class Servant {
	protected int id;
	protected String nom;
	protected String nomOriginal;
	protected String nomClasse;
	protected int rarete;
	protected int atqMax;
	protected int pvMax;
	protected String photo;
	
	public Servant(int id, String nom, String nomOriginal, String nomClasse, int rarete, int atqMax, int pvMax, String photo) {
		this.id = id;
		this.nom = nom;
		this.nomOriginal = nomOriginal;
		this.nomClasse = nomClasse;
		this.rarete = rarete;
		this.atqMax = atqMax;
		this.pvMax = pvMax;
		this.photo = photo;
	}
	
	public Servant() {
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomOriginal() {
		return nomOriginal;
	}

	public void setNomOriginal(String nomOriginal) {
		this.nomOriginal = nomOriginal;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	public int getRarete() {
		return rarete;
	}

	public void setRarete(int rarete) {
		this.rarete = rarete;
	}

	public int getAtqMax() {
		return atqMax;
	}

	public void setAtqMax(int atqMax) {
		this.atqMax = atqMax;
	}

	public int getPvMax() {
		return pvMax;
	}

	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Servant [id=" + id + ", name=" + nom + ", originalName=" + nomOriginal + ", className=" + nomClasse
				+ ", rarity=" + rarete + ", atkMax=" + atqMax + ", hpMax=" + pvMax + ", face=" + photo + "]";
	}
	
	
	
}
