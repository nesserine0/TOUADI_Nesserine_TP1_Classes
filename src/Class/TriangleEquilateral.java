package Class;

public class TriangleEquilateral extends Triangle {

	/**
	 * Constructeur de la classe TriangleEquilateral pour initialise un object TriangleEquilateral
	 * @param nom du TriangleEquilateral : string
     * @param origine le point : Point
	 * @param cote  : int
	 */

	public TriangleEquilateral(String nom, Point origine,int cote) {
		super(nom, origine,cote);
		
	}
	
	
	/**
	 * la superficie d'un TriangleEquilateral
	 */
	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		
		double h=Math.sqrt((Math.pow(this.getCote(), 2)-Math.pow(this.getCote()/2, 2)));
		
		return this.getCote()*h/2;
	}


	/**
	 * Affichage des information du TriangleEquilateral sous forme d'une chaine de caractere
	 */
	@Override
	public String toString() {
		return "TriangleEquilateral [ Cote =" + this.getCote() + ", Nom = " + this.getNom()
				+ ", Origine =" + this.getOrigine().afficher() +", Superficie=" + this.superficie()+ "]";
	}



	
	
	

}
