package introduction;

public class Salle {
	protected long id;
	protected String nom;
	
	public Salle() {
		
	}

	public Salle(String nom) {
		this.nom = nom;
	}
	
	public Salle(long id, String nom) {
		this(nom);
		this.id = id;
	}
	
	void methode1() {
		
	}
	
	boolean equals(Salle s1, Salle s2) {
		if(s1.id == s2.id)
			return true;
		return false;
	}
	
	
	
	
}
