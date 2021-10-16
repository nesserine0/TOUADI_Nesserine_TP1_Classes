package Class;

public class TriangleIsocele extends Triangle {

	private int base;

	/**
	 * Constructeur de la classe TriangleIsocele pour initialise un object TriangleIsocele
	 * @param nom du TriangleIsocele : string
     * @param origine le point : Point
	 * @param cote : int
	 * @param base : int
	 */
	public TriangleIsocele(String nom, Point origine,int cote,int base) {
		super(nom, origine,cote);
	    setBase(base);
		
	}
	
	/**
	 * un getter pour récuperer la valeur de la base 
	 * @return un entier base 
	 */
	public int getBase() {
		return base;
	}


	/**
	 * un setter pour modifier la valeur du Base
	 * @param base : de type double signifie le nouvelle valeur Base qu'on veut donner a cette TriangleIsocele 
	 */
	public void setBase(int base) {
		this.base = base;
	}


/**
 * la superficie d'un TriangleIsocele
 */
	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		
		double h=Math.sqrt((Math.pow(this.getCote(), 2)-Math.pow(base/2, 2)));
		
		return base*h/2;
	}


	/**
	 * Affichage des information du TriangleIsocele sous forme d'une chaine de caractere
	 */
	@Override
	public String toString() {
		return "TriangleIsocele [base=" + this.base + ", Cote=" + this.getCote() + ", Nom=" + this.getNom()
				+ ", Origine=" + this.getOrigine().afficher() +", Superficie=" + this.superficie()+ "]";
	}



	
	
	

}
