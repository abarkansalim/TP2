package introduction;

public class TestHeritage {

	public static void main(String[] args) {
		Salle s1 = new SalleCours(1, "Salle 1", (byte) 20);
		SalleCours s2 = new SalleCours(2, "Salle 2", (byte) 20);
		SalleCours s3 = (SalleCours)s1;
		SalleCours s4 = s3;
		
		Salle s5 = new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6 = new SalleCours(2, "Salle 2", (byte) 20);
		//SalleCours s7 = s5; on peut pas cast une instance fille par une autre
		SalleCours s8 = s6;
	}

}
