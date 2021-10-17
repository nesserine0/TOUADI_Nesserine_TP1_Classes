package Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	//global variable 
	public final static int episseur = 5;
	

	public static void main(String[] args) {
		

		//creation d'un point
		Point p=new Point(6,3);
		System.out.println("Mon "+p.afficher());
		
		//deplacer un point
		p.deplacer(5,6);
		System.out.println("Apres le déplacement du "+ p.afficher());
		
		//deplacer un point
		Point p2=new Point(10,1);
		p.deplacer(p2);
		System.out.println("Apres le déplacement du "+ p.afficher());
		
		
		//translater un point
		p.translater(1, 2);
		System.out.println("Apres la translation du "+ p.afficher());
			
		
		System.out.println("P "+p.afficher()+" == P2 "+p2.afficher()+"? "+ p.equal(p2));
		
		Point p3=new Point(11,3);
		System.out.println("P "+p.afficher()+" == P3 "+p3.afficher()+"? "+ p.equal(p3));
		
		
		System.out.println("\n ----------------------------------------------------\n");
		
		
		Carre carre=new Carre("carre", p, 5);
		System.out.println(carre.toString());
		System.out.println("superficie du mon carré : "+carre.superficie()+"\n");
		
		Rectangle rectangle=new Rectangle("Rectangle",p,10,6);
		System.out.println(rectangle.toString()+"\n");

		Cube cube=new Cube("Cube",p,10);
		System.out.println(cube.toString()+"\n");
		
		TriangleIsocele triangleIsocele=new TriangleIsocele("TriangleIsocele",p,10,5);
		System.out.println(triangleIsocele.toString()+"\n");
		
		TriangleEquilateral triangleEquilateral=new  TriangleEquilateral("TriangleEquilateral",p,5);
		System.out.println(triangleEquilateral.toString()+"\n");
		
		Cercle cercle =new Cercle("cercle", p,3);
		System.out.println(cercle.toString()+"\n");

		Sphere sphere =new Sphere("sphere", p,2);
		System.out.println(sphere.toString()+"\n");
		
		System.out.println("\n ----------------------------------------------------\n");
		//trie des formes
		List<Object> liste = new ArrayList();
		liste.add(carre);
		liste.add(rectangle);
		liste.add(cube);
		liste.add(triangleIsocele);
		liste.add(triangleEquilateral);
		liste.add(cercle);
		liste.add(sphere);
		
		System.out.println("Trie des formes selon la superficie \n");
		List<Object> listeTrie = liste.stream()
		.sorted(Comparator.comparing(o -> ((FormeGeometriques) o).superficie()))
		.collect(Collectors.toList());
		
		listeTrie.forEach(e->System.out.println(((FormeGeometriques) e).getNom()+" = "+((FormeGeometriques) e).superficie()));
		
	}
	
	public int EpissX2(int ep) {
		return ep*2;
	}

}
