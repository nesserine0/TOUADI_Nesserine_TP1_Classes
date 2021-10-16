package Class;


//le mot final ne laisse pas la class etre héritée par une autre class
/**
 * La classe cube ne peut pas être héritée par une autre classe 
 * @author Ness
 *
 */
public final  class Cube extends Carre {


/**
 * Constructeur de la classe Cube pour initialise un object cube 
 * @param nom du cube : string
 * @param origine le point : Point
 * @param longueur : double 
 */
	public Cube(String nom, Point origine, double longueur) {
		super(nom, origine, longueur);
		
	}



	/**
	 * la superficie d'un Cube 
	 */
	@Override
	public double superficie() {
	
		return Math.pow(this.getLongueur(), 2)*6;
	}
	
	
/**
 * une methode permetre de calculer le volume d'un cube , cette methode est finale : ne peut pas etre redifinie par les classes filles 
 * @param longueur : double 
 * @return double : volume de cube 
 */
	//le mot final interdit la redifinition de la methode  volume
	public final double Volume(double longueur ) {
		return Math.pow(longueur, 3);
	}


	/**
	 * Affichage des information du Cube sous forme d'une chaine de caractere
	 */
	@Override
	public String toString() {
		return "Cube [ longueur=" + longueur +
			  ", superficie =" + superficie()  + ", volume =" + Volume(this.getLongueur())  +  ", Nom=" + getNom() + ", Origine=" + getOrigine().afficher() + "]";
	}
	
	
	

}
