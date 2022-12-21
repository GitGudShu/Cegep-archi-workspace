package modele;

public class MessageEncode extends Message{
	
	protected Message message = new Message("");
	
    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                      'g', 'h', 'i', 'j', 'k', 'l',
                      'm', 'n', 'o', 'p', 'q', 'r',
                      's', 't', 'u', 'v', 'w', 'x',
                      'y', 'z', '1', '2', '3', '4',
                      '5', '6', '7', '8', '9', '0' };
    
    String[] code
        = { ".-",   "-...", "-.-.", "-..",  ".",
            "..-.", "--.",  "....", "..",   ".---",
            "-.-",  ".-..", "--",   "-.",   "---",
            ".--.", "--.-", ".-.",  "...",  "-",
            "..-",  "...-", ".--",  "-..-", "-.--",
            "--..", "|" };

	public MessageEncode(Message message)
	{
		System.out.println("MessageEncode()");
		this.message = message;
		this.coderMorse();
	}
	
	public void inverser()
	{
		String texteOriginal = this.message.texte;
		byte[] lettresOriginales = texteOriginal.getBytes();
		byte[] lettresFinales = new byte[lettresOriginales.length];
		for(int position = 0; position < lettresOriginales.length; position++)
		{
			byte lettre = lettresOriginales[position];
			lettresFinales[lettresOriginales.length-1-position] = lettre;
		}
		this.message.texte = new String(lettresFinales);
	}
	
	public void coderMorse()
	{
		String morse = "";
		for (int i = 0; i < this.message.texte.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (this.message.texte.charAt(i) == letter[j]) {
                	morse += code[j] + " ";
                    break;
                }
            }
        }
		this.message.texte = morse;
	}
	
	public String getTexte() {
		return message.getTexte();
	}
	public void setTexte(String texte) {
		message.setTexte(texte);
	}
	public String getAuteur() {
		return message.getAuteur();
	}
	public void setAuteur(String auteur) {
		message.setAuteur(auteur);
	}
}
