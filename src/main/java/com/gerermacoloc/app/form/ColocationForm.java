package com.gerermacoloc.app.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.gerermacoloc.app.form.generic.GenericForm;

public class ColocationForm implements GenericForm {
	
	@Size(min=3, max=15, message="Le nom de votre coloc doit comporter entre 3 et 15 caractères")
	private String name;
	
	@Email(message="Veuillez entrer un email valide")
	private String emailColoc;
	
	private String address;

	private String nameProprio;
	
	private String addressProprio;
	
	@Email(message="Veuillez entrer un email valide")
	private String emailProprio;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailColoc() {
		return emailColoc;
	}

	public void setEmailColoc(String emailColoc) {
		this.emailColoc = emailColoc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNameProprio() {
		return nameProprio;
	}

	public void setNameProprio(String nameProprio) {
		this.nameProprio = nameProprio;
	}

	public String getEmailProprio() {
		return emailProprio;
	}

	public void setEmailProprio(String emailProprio) {
		this.emailProprio = emailProprio;
	}

	public String getAddressProprio() {
		return addressProprio;
	}

	public void setAddressProprio(String addressProprio) {
		this.addressProprio = addressProprio;
	}
}
