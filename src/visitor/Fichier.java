/**
 * 
 */
package visitor;

/**
 * @author Hp
 *
 */
public class Fichier implements IFile{
	private String nomFichier;
	private  int TailleFichier;
	/**
	 * @return the tailleFichier
	 */
	
	/**
	 * @param nomFichier
	 * @param tailleFichier
	 */
	public Fichier(String nomFichier, int TailleFichier) {

		this.nomFichier = nomFichier;
		TailleFichier = 0;
	}
	@Override
	public void accept(IVisitorFile v) {
		// TODO Auto-generated method stub
		v.VisitFichier(this);
		
	}
	public int getTailleFichier() {
		// TODO Auto-generated method stub
		return TailleFichier;
	}
	
	
		}


