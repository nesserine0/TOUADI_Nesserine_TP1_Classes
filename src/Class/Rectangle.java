package Class;

public class Rectangle extends Carre {

	private double largeur;

	/**
	 * Constructeur de la classe Rectangle pour initialise un object Rectangle
	 * @param nom du Rectangle : string
     * @param origine le point : Point
	 * @param longueur : double
	 * @param largeur : double
	 */
	public Rectangle(String nom, Point origine, double longueur,double largeur) {
		super(nom, origine, longueur);
		setLargeur(largeur);
	}

	
	/**
	 * un getter pour récuperer Largeur d'un Rectangle 
	 * @return double 
	 */
	public double getLargeur() {
		return largeur;
	}



	/**
	 * un setter pour modifier la Largeur du Rectangle
	 * @param largeur : double 
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}



	/**
	 * la superficie d'un Rectangle 
	 */
	@Override
	public double superficie() {
	
		return this.getLargeur()*this.getLongueur();
	}


	/**
	 * Affichage des information du Rectangle sous forme d'une chaine de caractere
	 */
	@Override
	public String toString() {
		return "Rectangle [largeur=" + largeur + ", longueur=" + longueur +
			  ", superficie =" + superficie()  + ", Nom=" + getNom() + ", Origine=" + getOrigine().afficher() + "]";
	}
	
	
	

}
