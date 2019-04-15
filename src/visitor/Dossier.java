/**
 * 
 */
package visitor;

import java.util.ArrayList;

/**
 * @author Hp
 *
 */
public class Dossier implements IFile {
	private String nomDossier;
	private int TailleDossier;
	private ArrayList<IFile> a;

	@Override
	public void accept(IVisitorFile v) {
		// TODO Auto-generated method stub
		v.VisitDossier(this);
		
	}

	/**
	 * @param nomDossier
	 * @param tailleDossier
	 */
	public Dossier(String nomDossier) {
		super();
		this.nomDossier = nomDossier;
		TailleDossier = 0;
	}
	public void ajouter(IFile fichier){
			
		}
		/**
	 * @return the a
	 */
	public ArrayList<IFile> getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(ArrayList<IFile> a) {
		this.a = a;
	}

		public void supprimer(){
				
		
		}
		public int CalculTaille(){
			return TailleDossier;
			
		}

		/**
		 * @return the tailleDossier
		 */
		public int getTailleDossier() {
			return TailleDossier;
		}

		/**
		 * @param tailleDossier the tailleDossier to set
		 */
		public void setTailleDossier(int tailleDossier) {
			TailleDossier = tailleDossier;
		}

		

		
}
