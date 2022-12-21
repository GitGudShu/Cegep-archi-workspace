package controleur;

import java.awt.Color;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import javafx.scene.input.MouseEvent;
import vue.VueJardinator;

public class ControleurJardinator extends Controleur{

	private String currentLegume = "carotte";
	
	public ControleurJardinator()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
	}
	
	public void initialiser()
	{
		
	}
	
	public void notifierClicSemis(String nom) {
		currentLegume = nom;
		VueJardinator.getInstance().activerSemis(nom);
	}

	public void notifierClicJardin(MouseEvent e) {
		VueJardinator.getInstance().afficherLegume(e.getX(),e.getY(),currentLegume+".png");
	}

}
