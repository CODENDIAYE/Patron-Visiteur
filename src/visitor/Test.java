/**
 * 
 */
package visitor;

/**
 * @author Hp
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dossier d1=new Dossier("Racine");
		d1.ajouter(new Fichier("bonjour.txt",100));
		d1.ajouter(new Fichier("yongo.txt",88));
		d1.ajouter(new Fichier("toto.txt",55));
		Dossier d2=new Dossier("Doc");
		d2.ajouter(new Fichier("adama.doc",235));
		d1.ajouter(d2);
		d2.ajouter(new Fichier("guide.txt",85));
		Dossier d3=new Dossier("Temp");
		
		d1.ajouter(d3);
		
		CalculTaille visitor1=new CalculTaille();
		d2.accept(visitor1);
		
		System.out.println("Taille du dossier racine " +d2.CalculTaille()  );
		
		System.out.println("Taille du dossier doc");
		CalculTaille visitor2=new CalculTaille();
		d2.accept(visitor1);
		
	}

}
