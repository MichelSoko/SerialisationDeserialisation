package metier;

import java.io.Serializable;

public class Animal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nom;
	private String couleur;
	
	// Constructeur
	public Animal(String nom, String couleur) {
		this.setNom(nom);
		this.setCouleur(couleur);
	}

	// Accesseur et modificateur
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}