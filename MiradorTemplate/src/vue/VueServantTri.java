package vue;


import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurServantTri;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modele.Servant;

public class VueServantTri extends Vue {

	protected ControleurServantTri controleur = null;
	protected static VueServantTri instance = null; 
	public static VueServantTri getInstance() {if(null==instance)instance = new VueServantTri();return VueServantTri.instance;}; 

	private VueServantTri() {
		super("servantTri.fxml", VueServantTri.class);
		Logger.logMsg(Logger.INFO, "new VueServants()");
		super.controleur = this.controleur = new ControleurServantTri();
	}
	
	public void activerControles() {
		((Button)lookup("#ssr")).setOnAction((e) ->{
			((ListView<Label>)lookup("#liste-servant")).getItems().clear();
			controleur.trierServantsSSR();
		});
		
		((Button)lookup("#force")).setOnAction((e) ->{
			((ListView<Label>)lookup("#liste-servant")).getItems().clear();
			controleur.trierServantsForts();
		});
		
		((Button)lookup("#favori")).setOnAction((e) ->{
			((ListView<Label>)lookup("#liste-servant")).getItems().clear();
			controleur.reinitialiserListe();
		});
	}
	
	public void afficherListeServants(List<Servant> servants) {
		System.out.println("");
		System.out.println("VueServants.afficherListeServants()");
		
		ListView<Label> listeServants = ((ListView<Label>)lookup("#liste-servant"));
		
		for(Servant servant : servants) // foreach
		{
			ImageView visage = new ImageView(new Image(servant.getPhoto()));
			Label servantInfo = new Label(servant.getNom() + " (" +servant.getRarete() + ") " + "ATQ: " + servant.getAtqMax()+ " PV: " + servant.getPvMax(), visage);
			listeServants.getItems().add(servantInfo);
		}
		
	}

}
