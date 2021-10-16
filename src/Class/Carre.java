package Class;

public class Carre extends FormeGeometriques {

	
	protected double longueur;

	//référencer les objets de la classe parent => FormeGeometriques
	
	/**
	 * Constructeur de la classe carre pour initialise un object Carre 
	 * @param nom du carre : string
	 * @param origine le point : Point
	 * @param longueur : double
	 */
	public Carre(String nom, Point origine,double longueur) {
		super(nom, origine);
		//this => l'objet courant
		setLongueur(longueur);
		
	}
	
	

	/**
	 * un getter pour récuperer Longueur d'un Carre
	 * @return double 
	 */
	public double getLongueur() {
		return longueur;
	}


	/**
	 * un setter pour modifier la Longueur du Carre
	 * @param longueur double
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}




	/**
	 * la superficie d'un Carre
	 */
	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return this.longueur*this.longueur;
	}

	/**
	 * Affichage des information du Carre sous forme d'une chaine de caractere
	 */
	//this => l'objet courant 
	@Override
	public String toString() {
		return "Carre [ Nom="+this.getNom()+" , longueur=" + longueur + ", Point=" + this.getOrigine().afficher() + "]";
	}
	
	
	

}
