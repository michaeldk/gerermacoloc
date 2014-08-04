package com.gerermacoloc.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Colocation extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "colocation_sequence_gen")
    @SequenceGenerator(name = "colocation_sequence_gen", sequenceName = "colocation_id_seq")
    private int id;
	
	@NotNull
	private String name;
	
	private String adresse;
	
	private String email;
	
	private String proprietaire;
	
	private String adresseProprietaire;
	
	private String emailProprietaire;

	public Colocation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getAdresseProprietaire() {
		return adresseProprietaire;
	}

	public void setAdresseProprietaire(String adresseProprietaire) {
		this.adresseProprietaire = adresseProprietaire;
	}

	public String getEmailProprietaire() {
		return emailProprietaire;
	}

	public void setEmailProprietaire(String emailProprietaire) {
		this.emailProprietaire = emailProprietaire;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
