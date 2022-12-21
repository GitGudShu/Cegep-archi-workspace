import modele.Message;
import modele.MessageEncode;

public class App {

	public static void main(String[] args) {
		
		Message message = new Message("i wish you to have a better day");
		
		Message message2 = new MessageEncode(message);
		System.out.println("Le message décoré une fois : "+message2.getTexte());

	}

}
