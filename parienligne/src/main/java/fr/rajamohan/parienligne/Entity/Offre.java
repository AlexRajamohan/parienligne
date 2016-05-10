package fr.rajamohan.parienligne.Entity;

public class Offre {
	
	private int idOffre=0;
	private String detailsOffre;
	private int gain;
	
	public Offre(String detailsOffre, int gain){
		idOffre++;
		this.detailsOffre=detailsOffre;
		this.gain=gain;
	}
	
	public void publier(){
		
	}

}
