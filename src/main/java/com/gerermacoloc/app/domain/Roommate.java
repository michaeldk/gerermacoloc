package com.gerermacoloc.app.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class Roommate extends Versionable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "user_sequence_gen")
    @SequenceGenerator(name = "user_sequence_gen", sequenceName = "user_id_seq")
    private int id;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@NotEmpty
	@ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<String> roles;
	
	@OneToOne
	private Colocation colocation;
	
	public Roommate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}
	
	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
	public boolean hasRole(String role) {
		return this.roles != null && this.roles.contains(role);
	}
	
	public void addRole(String role) {
		if (this.roles == null) {
			this.roles = new ArrayList<String>();
		}
		this.roles.add(role);
	}
	
	public void removeRole(String role) {
		if (this.roles == null) {
			return;
		}
		this.roles.remove(role);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Roommate)) return false;
		Roommate roommate = (Roommate) obj;
		return this.id == roommate.getId();
	}
}
