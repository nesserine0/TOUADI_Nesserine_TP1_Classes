package Class;

public class Cercle extends FormeGeometriques {

	
	private double diametre;

	/**
	 * Constructeur de la classe Cercle pour initialise un object Cercle 
	 * @param nom du cercle : string
	 * @param origine le point : Point
	 * @param diametre du cercle : double 
	 */
	public Cercle(String nom, Point origine,double diametre) {
		super(nom, origine);
		
		setDiametre(diametre);
		
	}
	
	
	
	
/**
 * un getter pour récuperer Diametre d'un Cercle 
 * @return double
 */
	public double getDiametre() {
		return diametre;
	}

	/**
	 * un setter pour modifier le Diametre du Cercle
	 * @param diametre double 
	 */
	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}




	/**
	 * la superficie d'un Cercle
	 */
	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return Math.pow(this.diametre, 2)*Math.PI;
	}

	/**
	 * Affichage des information du Cercle sous forme d'une chaine de caractere
	 */
	@Override
	public String toString() {
		return "Cercle [ Nom="+this.getNom()+" , diametre=" + diametre + ", Point=" + this.getOrigine().afficher()+", Superficie=" + superficie()+"]";
	}
	
	
	

}
