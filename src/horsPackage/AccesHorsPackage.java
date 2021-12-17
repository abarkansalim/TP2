package horsPackage;

import introduction.Salle;

public class AccesHorsPackage extends Salle {

	public AccesHorsPackage(long id, String nom) {
		super(id, nom);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Salle salleB = new Salle(2,"Salle B");
		
		//System.out.println(salleB.id + " -- " + salleB.nom);

	}
	
	public void afficher(Salle s) {
		//System.out.println(s.id);
		//System.out.println(s.nom);
		System.out.println(id);
		System.out.println(nom);
		
		//Les attributs accédé par heritage sont visible
	}

}
