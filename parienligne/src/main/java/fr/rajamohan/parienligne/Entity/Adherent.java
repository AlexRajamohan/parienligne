package fr.rajamohan.parienligne.Entity;

public class Adherent {
	
	private String email;
	private String mdp;
	private String id;
	
	public Adherent(){
	}
	
	/*public Adherent(String email, String mdp, String id){
		this.email=email;
		this.mdp=mdp;
		this.id=id;
	}
	
	pas besoin dautre constructeur on passe par get set*/
	
	public void crediterCompte(float montant){
	//	c.crediter(montant);
	}
	
	
	public void parier(boolean affirmation){
	}
	
	/*public void creerPari(String objet, int montant, String dateLimite, int nbMaxParticipant){
	new Pari(String objet, int montant, String dateLimite, int nbMaxParticipant);
	}*/

	public void cloturer(){
		
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	    }
	
	public String getEmail() {
		return email;
	    }

	public void setMdp(String mdp) {
		this.mdp = mdp;
	    }
	    public String getMdp() {
		return mdp;
	    }
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id=id;
	}
}
