package bo;

import java.util.Date;

public class Enchere {
	 public Date dateEnchere;
	 public int montant_enchere;
	 private ArticleVendu articleVendu;
	 private Utilisateur utilisateur;
	 
	 
	 
	 
	 
	public Enchere(Date dateEnchere, int montant_enchere, ArticleVendu articleVendu, Utilisateur utilisateur) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
		this.articleVendu = articleVendu;
		this.utilisateur = utilisateur;
	}

	public Date getDateEnchere() {
		return dateEnchere;
	}
	
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	
	public int getMontant_enchere() {
		return montant_enchere;
	}
	
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}

	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere + ", articleVendu="
				+ articleVendu + ", utilisateur=" + utilisateur + ", getDateEnchere()=" + getDateEnchere()
				+ ", getMontant_enchere()=" + getMontant_enchere() + ", getArticleVendu()=" + getArticleVendu()
				+ ", getUtilisateur()=" + getUtilisateur() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	 
	

}
