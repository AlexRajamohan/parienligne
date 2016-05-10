//package fr.rajamohan.parienligne.controllers;
//
//import javax.validation.constraints.Pattern;
//
//import org.hibernate.validator.constraints.NotEmpty;
//
//public class CreationForm {
//
//    @NotEmpty
//    private String email;
//    @NotEmpty
//    private String login;
//    @NotEmpty
//    private String motDepasse;
//    
//    @NotEmpty
//    @Pattern(regexp="\\d*")
//    private int id;
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}
//
//	public String getMotDepasse() {
//		return motDepasse;
//	}
//
//	public void setMotDepasse(String motDepasse) {
//		this.motDepasse = motDepasse;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
// 
//}