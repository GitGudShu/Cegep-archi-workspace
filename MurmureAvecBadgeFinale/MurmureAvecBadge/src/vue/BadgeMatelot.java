package vue;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

// TODO : changer symbole de String vers Enum
// on constate un probleme avec les constructeurs
public class BadgeMatelot extends AnchorPane{

	protected ImageView masqueEcusson = new ImageView();
	protected ImageView symboleMatelot = new ImageView();
	protected Label titre = new Label("MATELOT");
	
	public BadgeMatelot()
	{
        this.setPrefHeight(200);
        this.setPrefWidth(166);
        this.setStyle("-fx-background-color: yellow;");
        
        //this.ajouterTitre("MATELOT");
		//this.ajouterEcusson("ARMOIRIE");
		//this.ajouterSymbole("TSUNAMI");	// valeur par defaut
	}
	
	public BadgeMatelot(String ecusson)
	{
        this.setPrefHeight(200);
        this.setPrefWidth(166);
        this.setStyle("-fx-background-color: yellow;");
        
        this.ajouterTitre("MATELOT");
		this.ajouterEcusson(ecusson);
		this.ajouterSymbole("TSUNAMI");			
	}
	
	public BadgeMatelot(String ecusson, String symbole)
	{
        this.setPrefHeight(200);
        this.setPrefWidth(166);
        this.setStyle("-fx-background-color: yellow;");
        
        this.ajouterTitre("MATELOT");
		this.ajouterEcusson(ecusson);
		this.ajouterSymbole(symbole);			
	}
	
	public BadgeMatelot(String ecusson, String symbole, String titre)
	{
        this.setPrefHeight(200);
        this.setPrefWidth(166);
        this.setStyle("-fx-background-color: yellow;");
        
        this.ajouterTitre(titre);
		this.ajouterEcusson(ecusson);
		this.ajouterSymbole(symbole);			
	}
	
	public BadgeMatelot(String ecusson, String symbole, String titre, String couleur)
	{
        this.setPrefHeight(200);
        this.setPrefWidth(166);
        this.setStyle("-fx-background-color: "+couleur+";"); // TODO factoriser en fonction pour uniformité
        
        this.ajouterTitre(titre);
		this.ajouterEcusson(ecusson);
		this.ajouterSymbole(symbole);			
	}
	
	private void ajouterTitre(String texte)
	{
		titre.setText(texte);
		titre.setLayoutY(37);
		titre.setPrefHeight(40);
		titre.setPrefWidth(166);
		titre.setAlignment(Pos.CENTER);
		titre.setStyle("-fx-font-weight:bold;-fx-font-size:20px;");
		this.getChildren().add(titre);
		
	}
	
	private void ajouterEcusson(String ecusson)
	{
		if(ecusson.compareTo("ARMOIRIE") == 0)
		{
			masqueEcusson.setImage(new Image("vue/badge/armoirie.png"));			
		}
		else if(ecusson.compareTo("POLICE") == 0)
		{
			masqueEcusson.setImage(new Image("vue/badge/police.png"));						
		}
		else
		{
			masqueEcusson.setImage(new Image("vue/badge/armoirie.png"));						
		}
        masqueEcusson.setLayoutX(-1);
        masqueEcusson.setFitHeight(200);
        masqueEcusson.setFitWidth(200);
        masqueEcusson.setPreserveRatio(true);
		this.getChildren().add(masqueEcusson);		
	}
	
	// valeurs de symbole = TSUNAMI ou ECLAIR ou SOLEIL
	private void ajouterSymbole(String symbole)
	{
		if(symbole.compareTo("TSUNAMI") == 0) // identique si compareTo donne 0
		{			
			symboleMatelot.setImage(new Image("vue/badge/tsunami.png"));
		}
		else if (symbole.compareTo("ECLAIR") == 0)
		{
			symboleMatelot.setImage(new Image("vue/badge/eclair.png"));			
		}
		else if (symbole.compareTo("SOLEIL") == 0)
		{
			symboleMatelot.setImage(new Image("vue/badge/soleil.png"));			
		}
		else
		{
			symboleMatelot.setImage(new Image("vue/badge/tsunami.png"));			
		}
		symboleMatelot.setLayoutX(45);
		symboleMatelot.setLayoutY(130);
		symboleMatelot.setFitHeight(79);
		symboleMatelot.setFitWidth(81);
		symboleMatelot.setPreserveRatio(true);		
		this.getChildren().add(symboleMatelot);
	}
	
	public BadgeMatelot avecEcusson(String ecusson)
	{
		this.ajouterEcusson(ecusson);
		return this;
	}
	
	public BadgeMatelot avecSymbole(String symbole)
	{
		this.ajouterSymbole(symbole);
		return this;
	}
	
	public BadgeMatelot avecTitre(String titre)
	{
		this.ajouterTitre(titre);
		return this;
	}
	
	public BadgeMatelot coloreDe(String couleur)
	{
        this.setStyle("-fx-background-color: "+couleur+";");

		return this;
	}
	

}
 