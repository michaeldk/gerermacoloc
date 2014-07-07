package com.gerermacoloc.app.form;

import org.hibernate.validator.constraints.NotBlank;

import com.gerermacoloc.app.form.generic.GenericForm;

public class CreateColocationForm implements GenericForm {
	
	@NotBlank
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
