package Class;

public class Point {

	private int x;
	private int y;
	
	
	/**
	 * Constructeur vide 
	 */
	public Point() {
		super();
		
	}
	
	 
	/**
	 * Constructeur de la classe point pour initialise un object point 
	 * @param x une abscisse (x) doit etre supérieure ou égale à zéro 
	 * @param y une ordonnée (y) doit etre supérieure ou égale à zéro
	 */
	public Point(int x, int y) {
		super();
		
		setX(x);
		setY(y);
	}
	
	/**
	 * un getter pour récuperer l'abscisse X d'un point  
	 * @return la valeur d'abscisse X d'un point
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * un setter pour modifier l'abscisse X
	 * @param x l'abscisse X doit etre >=0
	 */
	public void setX(int x) {
		if(x>=0)this.x = x;
		else throw new IllegalArgumentException(" Can't set x , X is <= 0");
	}
	
	/**
	 * un getter pour récuperer une ordonnée Y d'un point  
	 * @return la valeur d'une ordonnée Y d'un point
	 */
	public int getY() {
		return y;
	}
	
	
	
	/**
	 * un setter pour modifier l'ordonnée Y
	 * @param y l'ordonnée Y doit etre >=0
	 */
	public void setY(int y) {
		if(y>=0)this.y = y;
		else throw new IllegalArgumentException("Can't set y , Y is <= 0");
		}
	
	
	/**
	 * Le déplacement d’un point consiste à changer son abscisse et son ordonnée 
	 * @param x deplacer x , doit etre >=0
	 * @param y deplacer y , doit etre >=0
	 */
	public void deplacer (int x , int y) 
	{
		setX(x);
		setY(y);
	}
	
	/**
	 * Le déplacement d’un point consiste à changer son abscisse et son ordonnée par rapport a un autre point
	 * @param p deplacer un point vers un autre point , (x et y)doivent etre >=0
	 */
	public void deplacer (Point p) 
	{
		deplacer(p.getX(),p.getY());
	}


	/**
	 * affichage d'un point , son X et Y 
	 * @return String 
	 */
	public String afficher() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	/**
	 * La translation d’un point consiste à le glisser sur le plan selon les valeurs x et y
	 * exemple : x=10 , p.x=5 , translation => 5+10=15 , p.x=15 
	 * @param x int la valeur pour glisser sur l'axe x 
	 * @param y int la valeur pour glisser sur l'axe y
	 */
	public void translater (int x , int y) 
	{
		setX(this.getX()+x);
		setY(this.getY()+y);
	}
	
	
	
	/**
	 * une methode por comparer 2 point
	 * si leurs sont egaux et leurs y sont egaux , les points sont egaux 
	 * @param p un object point
	 * @return true si s’ils possèdent la même abscisse et la même ordonnée , sinon false 
	 */
	public Boolean equal ( Point p) 
	{
		if(this.x==p.getX() && this.y==p.getY()) return true;
		else return false;
	}
	
}
