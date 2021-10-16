package Class;

public abstract class Triangle extends FormeGeometriques {

	
	private int cote;

	/**
	 * Constructeur de la classe Triangle pour initialise un object Triangle 
	 * @param nom du triangle : string
     * @param origine le point : Point
	 * @param cote : int 
	 */
	public Triangle(String nom, Point origine,int cote) {
		super(nom, origine);
		setCote(cote);
		
	}
	
	
	/**
	 * un getter pour récuperer la valeur de la Cote 
	 * @return un entier Cote 
	 */
	public int getCote() {
		return cote;
	}


	/**
	 * un setter pour modifier la valeur du Cote
	 * @param cote : de type entier signifie le nouvelle valeur Cote qu'on veut donner a cette Triangle
	 */
	public void setCote(int cote) {
		this.cote = cote;
	}
	
	

}
