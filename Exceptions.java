
public class Exceptions {
	public static String henk = "henk";

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				zetOm(henk);
			    zetOm("3A");
			    zetOm("22");
			  }
	
			  public static void zetOm(String tekst) {
			    try {
			      int getal = Integer.parseInt(tekst);
			      System.out.println("Het is gelukt om " + tekst +  " om te zetten: " + getal);
			    } catch (NumberFormatException fout) {
			      System.out.println("Het is niet gelukt om " + tekst +  " om te zetten naar een getal.");
			    }
	}

}
