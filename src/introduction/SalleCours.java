package introduction;

public class SalleCours extends Salle {
	byte nbPlace;
	
	public SalleCours(long id, String nom, byte nbPlace) {
		super(id, nom);
		this.nbPlace = nbPlace;
		
	}
}
