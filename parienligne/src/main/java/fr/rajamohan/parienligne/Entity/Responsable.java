package fr.rajamohan.parienligne.Entity;

public class Responsable {
	
	private String id;
	
	public Responsable(String id){
		this.id=id;
	}

	public void definirOffre(String details, int gain){
//		new Offre(String details, int gain);
		Offre o = new Offre(details, gain);
	}
	
	public void publierOffre(int idOffre){
		
	}
	
	public void reglerConflit(int idPari){
		
	}
	

}
