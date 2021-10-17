package Class;
public abstract class FormeGeometriques {

	//global variable 
	public static int EPAISSEUR = 5;
	
	private String Nom;
	private Point origine;
	
	/**
	 * un constructeur de la class pour initialiser un object de type FormeGeometriques
	 * @param nom le nom de la forme
	 * @param origine = le point 
	 */
	public FormeGeometriques(String nom, Point origine) {
		super();
		Nom = nom;
		//this => l'objet courant => this.origine est  point de la forme courante , origine est le point passé en parametre
		this.origine = origine;
	}


	/**
	 * un getter pour récuperer le nom de la forme 
	 * @return le nom d'une forme 
	 */
	public String getNom() {
		return Nom;
	}

   /**
    * un setter pour modifier la valeur du nom de la forme
    * @param nom : String , signifie le nouveau nom qu'on veut donner a cette forme 
    */
	public void setNom(String nom) {
		Nom = nom;
	}


	/**
	 * un getter pour récuperer le point (origine) de la forme 
	 * @return Point : l'origine d'une forme 
	 */
	public Point getOrigine() {
		return origine;
	}

    /**
     * 
     * @param origine : un point (la nouvelle x, et y)
     */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	
	
	/**
	 * une methode qui doit etre implimenté dans les classes filles en respectant le contrat défini par la classe mère
	 * la class fille est libre dans son traitement de cette methode "le code a l'intérieur de la méthode"
	 * @return un double , la superficie d'une forme
	 */
	public abstract double superficie();
	
	
	/**
	 * une methode por comparer 2 FormeGeometriques
	 * si leurs superficie est egaux , les formes sont egaux
	 * @param forme un object de type FormeGeometriques
	 * @return true si egaux , false sinon 
	 */
	public Boolean equal (Object forme) 
	{
	    if(forme == null) return false ;
		if (this.superficie() == ((FormeGeometriques)forme).superficie()) return true;
		else return false;
	}
	
	
	/**
	 * permettant de doubler (multiplier fois 2) l’épaisseur des différentes formes géométriques
	 * @param ep l’épaisseur de la forme 
	 * @return l’épaisseur X 2 
	 */
	public int EpissX2(int ep) {
		return ep*2;
	}
	
	
}
