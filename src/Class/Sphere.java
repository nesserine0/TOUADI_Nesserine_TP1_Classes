package Class;

public class Sphere extends Cercle{

	
	/**
	 * Constructeur de la classe Sphere pour initialise un object Sphere
	 * @param nom du Sphere : string
     * @param origine le point : Point
	 * @param diametre  : double
	 */
	public Sphere(String nom, Point origine, double diametre) {
		super(nom, origine, diametre);
	
	}

	
	/**
	 * la superficie d'un Sphere
	 */
	@Override
	public double superficie() {
	
		return Math.pow(this.getDiametre(),2)*Math.PI*4;
	}

	
	//le mot final interdit la redifinition de la methode  volume
	/**
	 * une methode permetre de calculer le volume du Sphere , cette methode est finale : ne peut pas etre redifinie par les classes filles 
	 * @return double : volume de Sphere
	 */
	public final double Volume( ) {
		return Math.pow(this.getDiametre(),3)*Math.PI*4/3;
	}


	/**
	 * Affichage des information du Shpere sous forme d'une chaine de caractere
	 */
	@Override
	public String toString() {
		//"]$ => replace last occ only
		return super.toString().replace("Cercle","Sphere").replaceAll("]$"," ,")+" Volume = "+this.Volume()+"]";
	}
	
	
}
