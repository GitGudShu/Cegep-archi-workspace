package vue;


import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurServant;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modele.Servant;

public class VueServant extends Vue {

	protected ControleurServant controleur = null;
	protected static VueServant instance = null; 
	public static VueServant getInstance() {if(null==instance)instance = new VueServant();return VueServant.instance;}; 

	private VueServant() {
		super("servant.fxml", VueServant.class);
		Logger.logMsg(Logger.INFO, "new VueServants()");
		super.controleur = this.controleur = new ControleurServant();
	}
	
	public void afficherServants(List<Servant> servants) {
		System.out.println("");
		System.out.println("VueServants.afficherProfil()");
		
		for(Servant servant : servants) // foreach
		{
			((Label)lookup("#id-servant")).setText("(" + servant.getId() + ")");
			((Label)lookup("#origine-servant")).setText(servant.getNomOriginal());
			((Label)lookup("#nom-servant")).setText(servant.getNom());
			((Label)lookup("#classe-servant")).setText(servant.getNomClasse());
			((Label)lookup("#rarete-servant")).setText(""+servant.getRarete());
			((Label)lookup("#atq-servant")).setText(""+servant.getAtqMax());
			((Label)lookup("#pv-servant")).setText(""+servant.getPvMax());
			((ImageView)lookup("#servant-photo")).setImage(new Image(servant.getPhoto()));
		}
		
	}
	
	public void testerServant() {
		System.out.println("coucou");
		System.out.println((Label)lookup("#id-servant"));
		((Label)lookup("#id-servant")).setText("1");
	}
	
	

}
