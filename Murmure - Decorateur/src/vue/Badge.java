package vue;


import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Badge extends AnchorPane{

	protected ImageView masqueEcusson = new ImageView();
	protected ImageView symboleBadge = new ImageView();
	protected Label titre = new Label("TAKO");
	
	public Badge()
	{
		this.setLayoutX(83);
		this.setLayoutY(59);
		this.setPrefHeight(200);
        this.setPrefWidth(166);
        
        setCouleur("MEDIUMPURPLE");
        setTitre("TAKO");
        setEcusson("armoirie");
        setSymbole("lis");
        

	}
	
	protected void setCouleur(String couleur) {
		this.setStyle("-fx-background-color: "+couleur+";");
	}
	
	protected void setTitre(String nom) {
		this.getChildren().remove(titre);
		titre.setText(nom);
		titre.setLayoutX(16);
        titre.setLayoutY(37);
        titre.setPrefHeight(40);
        titre.setPrefWidth(137);
        titre.setAlignment(Pos.CENTER);
        titre.setStyle("-fx-font-weight:bold;-fx-font-size:20px;");
        this.getChildren().add(titre);
	}
	
	protected void setEcusson(String ecusson)
	{	
		this.getChildren().remove(masqueEcusson);
		switch(ecusson) {
		case "armoirie":
			masqueEcusson.setImage(new Image("vue/badge/armoirie.png"));
			break;
		case "police":
			masqueEcusson.setImage(new Image("vue/badge/police.png"));
			break;
		default:
			masqueEcusson.setImage(new Image("vue/badge/armoirie.png"));			
		}
		
		masqueEcusson.setFitHeight(200);
        masqueEcusson.setFitWidth(200);
        masqueEcusson.setLayoutX(-1);
        masqueEcusson.setPreserveRatio(true);
        this.getChildren().add(masqueEcusson);
	}
	
	protected void setSymbole(String symbole)
	{
		this.getChildren().remove(symboleBadge);
		switch(symbole) {
		case "bird":
			symboleBadge.setImage(new Image("vue/badge/bird.png"));
			break;
		case "flower":
			symboleBadge.setImage(new Image("vue/badge/flower.png"));
			break;
		case "lis":
			symboleBadge.setImage(new Image("vue/badge/fleur-de-lis.png"));	
			break;
		default:
			symboleBadge.setImage(new Image("vue/badge/flower.png"));			
		}
		
        symboleBadge.setLayoutX(-1);
        symboleBadge.setFitHeight(64);
        symboleBadge.setFitWidth(63);
        symboleBadge.setLayoutX(53);
        symboleBadge.setLayoutY(88);
        symboleBadge.setPreserveRatio(true);	
		this.getChildren().add(symboleBadge);
	}
	
	public Badge avecEcusson(String ecusson)
	{
		this.setEcusson(ecusson);
		return this;
	}
	
	public Badge avecSymbole(String symbole)
	{
		this.setSymbole(symbole);
		return this;
	}
	
	public Badge avecTitre(String titre)
	{
		this.setTitre(titre);
		return this;
	}
	
	public Badge coloreDe(String couleur)
	{
        setCouleur(couleur);
		return this;
	}
	
	

}
 