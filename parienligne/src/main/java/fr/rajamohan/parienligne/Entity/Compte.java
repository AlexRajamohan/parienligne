package fr.rajamohan.parienligne.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="CompteID")
	private Integer CompteId;
	
	@Column(name="Login")
	private String login;
	
	@Column (name="MotDePasse")
	private String motDePasse;
	
	@Column (name="TypeDeCompte")
	private String typeDeCompte;
	
	@Column (name="Email")
	private String email;
	
	public Compte() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCompteId() {
		return CompteId;
	}

	public void setCompteId(Integer compteId) {
		CompteId = compteId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getTypeDeCompte() {
		return typeDeCompte;
	}

	public void setTypeDeCompte(String typeDeCompte) {
		this.typeDeCompte = typeDeCompte;
	}
	
//	@Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (!(obj instanceof User))
//            return false;
//        User other = (User) obj;
//        if (id == null) {
//            if (other.id != null)
//                return false;
//        } else if (!id.equals(other.id))
//            return false;
//        if (ssoId == null) {
//            if (other.ssoId != null)
//                return false;
//        } else if (!ssoId.equals(other.ssoId))
//            return false;
//        return true;
//    }
 
    @Override
    public String toString() {
        return "User [id=" + CompteId + ", mot de passe=" + motDePasse
                + ", email=" + email + "]";
    }
}