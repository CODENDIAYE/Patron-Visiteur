/**
 * 
 */
package visitor;

/**
 * @author Hp
 *
 */
public class CalculTaille implements IVisitorFile  {
	private int taille;
	

	public CalculTaille() {
		// TODO Auto-generated constructor stub
		super();
		this.taille = 0;
	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public void VisitDossier(Dossier d) {
		// TODO Auto-generated method stub
		this.setTaille(getTaille()+d.getTailleDossier());
		
		
	}

	@Override
	public void VisitFichier(Fichier f) {
		// TODO Auto-generated method stub
		this.setTaille(getTaille()+f.getTailleFichier());
		
	}
	public void visitRep(Dossier elementDoc)
	{
		for (IFile e: elementDoc.getA()) {
			if (e instanceof IFile)
					e.accept(this);
			
		}
	}
	

}

	/**
	 * @param taille
	 */
	
