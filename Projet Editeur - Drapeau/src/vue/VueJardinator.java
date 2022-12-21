package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurJardinator;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VueJardinator extends Vue {

	protected ControleurJardinator controleur;
	protected static VueJardinator instance = null; 
	public static VueJardinator getInstance() {if(null==instance)instance = new VueJardinator();return VueJardinator.instance;}; 
	
	String[] elems = {
			"carotte",
			"chou",
			"radis",
			"oignon",
			"chou-fleur",
			"panais",
			"champignon",
			"laitue"
	} ;
	
	private VueJardinator() 
	{
		super("jardinator.fxml", VueJardinator.class, 1294,743);
		super.controleur = this.controleur = new ControleurJardinator();
		Logger.logMsg(Logger.INFO, "new VueJardinator()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		Button bouton;
		for(String legume : elems) {
			bouton = (Button) lookup("#choisir-"+legume);
			bouton.setOnAction(e -> 
	            {
	            	controleur.notifierClicSemis(legume);
	            });
		}

		
		((Rectangle) lookup("#jardin-terre")).setOnMouseClicked(e -> {
			controleur.notifierClicJardin(e);
		});
		
		activerSemis("carotte");
	}
	
	public void activerSemis(String nom) {
		Button semi;
		for(String legume : elems){
			semi = (Button) lookup("#choisir-"+legume);
			if(legume.equals(nom)) {
				semi.setStyle("-fx-background-color:green; -fx-opacity:0.5;");
			}else {
				semi.setStyle("");
			}
		}
	}
	
	public void afficherLegume(double x,double y,String imagePath) {
		Image image = new Image("vue/decoration/semis/"+imagePath);
		
		ImageView img = new ImageView(image);
		img.setScaleX(0.25);
		img.setScaleY(0.25);
	
		((AnchorPane) lookup("#jardin-cloture")).getChildren().add(img);
		img.setLayoutX(x-img.getImage().getWidth()/2);
		img.setLayoutY(y-img.getImage().getHeight()/2);
	}

}
