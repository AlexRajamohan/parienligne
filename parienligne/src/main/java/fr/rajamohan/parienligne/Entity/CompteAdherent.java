package fr.rajamohan.parienligne.Entity;

public class CompteAdherent extends Compte{
	
	private float solde=0;
	
	public CompteAdherent(String id, String mdp){
		super();
	}

	public boolean crediter(float montant){
		solde=+montant;
		//a completer
		return true;
	}
	
	public boolean debiter(float montant){
		if (montant<solde){
			solde=-montant;
			return true;
		}
		else 
			return false;
	}
	

}
