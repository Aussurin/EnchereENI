package bo;

import java.util.List;

public class Utilisateur {
	
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private String rue;
	private int codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private String administrateur;
	List<ArticleVendu> articleVendu;
	List<Enchere> enchere;
	
	
	
	
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse, int credit, String administrateur,
			List<ArticleVendu> articleVendu, List<Enchere> enchere) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.articleVendu = articleVendu;
		this.enchere = enchere;
	}


	public Utilisateur () {
		
	}


	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String rue,
			int codePostal, String ville, String motDePasse, int credit, String administrateur,
			List<ArticleVendu> articleVendu, List<Enchere> enchere) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.articleVendu = articleVendu;
		this.enchere = enchere;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public List<ArticleVendu> getArticleVendu() {
		return articleVendu;
	}


	public void setArticleVendu(List<ArticleVendu> articleVendu) {
		this.articleVendu = articleVendu;
	}


	public List<Enchere> getEnchere() {
		return enchere;
	}


	public void setEnchere(List<Enchere> enchere) {
		this.enchere = enchere;
	}


	public String getNom() {
		return nom;
	}


	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}


	public String getPseudo() {
		return pseudo;
	}
	
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getMom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getRue() {
		return rue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int codePostal() {
		return codePostal;
	}
	
	public void setcodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getCredit() {
		return credit;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getAdministrateur() {
		return administrateur;
	}
	
	public void setAdministrateur(String administrateur) {
		this.administrateur = administrateur;
	}
	
	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}
	
	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}


	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + ", articleVendu=" + articleVendu + ", enchere=" + enchere
				+ ", getCodePostal()=" + getCodePostal() + ", getArticleVendu()=" + getArticleVendu()
				+ ", getEnchere()=" + getEnchere() + ", getNom()=" + getNom() + ", getPseudo()=" + getPseudo()
				+ ", getMom()=" + getMom() + ", getPrenom()=" + getPrenom() + ", getEmail()=" + getEmail()
				+ ", getTelephone()=" + getTelephone() + ", getRue()=" + getRue() + ", codePostal()=" + codePostal()
				+ ", getVille()=" + getVille() + ", getMotDePasse()=" + getMotDePasse() + ", getCredit()=" + getCredit()
				+ ", getAdministrateur()=" + getAdministrateur() + ", getNoUtilisateur()=" + getNoUtilisateur()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	
	
	
	

}
