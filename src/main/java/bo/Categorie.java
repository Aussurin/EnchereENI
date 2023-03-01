package bo;

import java.util.List;

public class Categorie {
	
	public int noCategorie;
	public long libelle;
	List<ArticleVendu> articleVendu;
	
	public Categorie() {
		
	}
	
	
	

	public Categorie(int noCategorie, long libelle, List<ArticleVendu> articleVendu) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
		this.articleVendu = articleVendu;
	}

	public List<ArticleVendu> getArticleVendu() {
		return articleVendu;
	}

	public void setArticleVendu(List<ArticleVendu> articleVendu) {
		this.articleVendu = articleVendu;
	}

	public int getNoCategorie() {
		return noCategorie;
	}
	
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	
	public long getLibelle() {
		return libelle;
	}
	
	public void setLibelle(long libelle) {
		this.libelle = libelle;
	}
	
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", articleVendu=" + articleVendu
				+ ", getArticleVendu()=" + getArticleVendu() + ", getNoCategorie()=" + getNoCategorie()
				+ ", getLibelle()=" + getLibelle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
