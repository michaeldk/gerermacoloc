package com.gerermacoloc.app.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ListObject extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "listobject_sequence_gen")
    @SequenceGenerator(name = "listobject_sequence_gen", sequenceName = "listobject_id_seq")
	private int id;
	
	@NotEmpty
	private String value;
	
	private boolean done;
	
	@NotNull
	@OneToOne
	private Roommate creater;
	
	@NotNull
	private Calendar dateCreated;
	
	@NotNull
	private Calendar dateDone;
	
	public ListObject() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Roommate getCreater() {
		return creater;
	}

	public void setCreater(Roommate creater) {
		this.creater = creater;
	}

	public Calendar getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Calendar dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Calendar getDateDone() {
		return dateDone;
	}

	public void setDateDone(Calendar dateDone) {
		this.dateDone = dateDone;
	}

}
