package vue;
import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurMurmure;
import javafx.scene.layout.Pane;

public class VueMurmure extends Vue {

	protected ControleurMurmure controleur;
	protected static VueMurmure instance = null; 
	public static VueMurmure getInstance() {if(null==instance)instance = new VueMurmure();return VueMurmure.instance;}; 
	
	private VueMurmure() 
	{
		super("murmure.fxml"); 
		super.controleur = this.controleur = new ControleurMurmure();
		Logger.logMsg(Logger.INFO, "new VueMurmure()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		Badge badge1 = new Badge();
		Badge badge2 = new BadgeFleur();
		Badge badge3 = new BadgeOiseau().avecTitre("OISEAU");
		
		Pane panneauChat = (Pane) lookup("#chat");
		panneauChat.getChildren().add(badge1);
		panneauChat.getChildren().add(badge2);
		panneauChat.getChildren().add(badge3);
	}
}
