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
		
		//BadgeMatelot badge2 = new BadgeMatelot("blue"); - INVALIDE
		//BadgeMatelot badge = new BadgeMatelot("POLICE", "SOLEIL", "ALCHIMISTE", "#333333" );
		BadgeMatelot badge = new BadgeMatelot("ARMOIRIE", "TSUNAMI", "ALCHIMISTE", "red" );
		
		//BadgeMatelot badge2 = new BadgeMatelot().avecEcusson("ARMOIRIE").avecSymbole("ECLAIR").coloreDe("orange").avecTexte("ALLO");
		
		BadgeMatelot badge2 = new BadgeMatelot().avecEcusson("ARMOIRIE").avecSymbole("ECLAIR").coloreDe("orange");
		BadgeMatelot badge3 = new BadgeMatelot().avecSymbole("SOLEIL");
		
		Pane panneauChat = (Pane) lookup("#chat");
		panneauChat.getChildren().add(badge2);
	}
}
