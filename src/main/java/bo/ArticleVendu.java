package bo;

import java.util.Date;
import java.util.List;

public class ArticleVendu {
	
	public int noArticle;
	public String nomArticle;
	public String description;
	public Date dateDebutEncheres;
	public Date dateFinEncheres;
	public int miseAPrix;
	public int prixVente;
	public String etatVente;
	List<Enchere>enchere;
	private Utilisateur utilisateur;
	private Categorie categorie;
	
	
public ArticleVendu() {
		
		
	}
	
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, int miseAPrix, int prixVente, String etatVente, List<Enchere> enchere,
			Utilisateur utilisateur, Categorie categorie) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.enchere = enchere;
		this.utilisateur = utilisateur;
		this.categorie = categorie;
	}



	
	
	

	public List<Enchere> getEnchere() {
		return enchere;
	}

	public void setEnchere(List<Enchere> enchere) {
		this.enchere = enchere;
	}

	public int getNoArticle() {
		return noArticle;
	}
	
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}
	
	public String getNomArticle() {
		return nomArticle;
	}
	
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateDebutEncheres() {
		return dateDebutEncheres;
	}
	
	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	
	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}
	
	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	
	public int getMiseAPrix() {
		return miseAPrix;
	}
	
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	
	public int getPrixVente() {
		return prixVente;
	}
	
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	
	public String getEtatVente() {
		return etatVente;
	}
	
	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", enchere=" + enchere
				+ ", utilisateur=" + utilisateur + ", categorie=" + categorie + ", getEnchere()=" + getEnchere()
				+ ", getNoArticle()=" + getNoArticle() + ", getNomArticle()=" + getNomArticle() + ", getDescription()="
				+ getDescription() + ", getDateDebutEncheres()=" + getDateDebutEncheres() + ", getDateFinEncheres()="
				+ getDateFinEncheres() + ", getMiseAPrix()=" + getMiseAPrix() + ", getPrixVente()=" + getPrixVente()
				+ ", getEtatVente()=" + getEtatVente() + ", getUtilisateur()=" + getUtilisateur() + ", getCategorie()="
				+ getCategorie() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
