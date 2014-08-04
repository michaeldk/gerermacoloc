package com.gerermacoloc.app.domain;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Operation extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "operation_sequence_gen")
    @SequenceGenerator(name = "operation_sequence_gen", sequenceName = "operation_id_seq")
    private int id;
	
	@NotNull
	@OneToOne
	private Roommate roommateOwing;
	
	@NotNull
	@OneToOne
	private Roommate roommateOwed;
	
	private double amount;
	
	@NotNull
	private Calendar date;
	
	@NotNull
	@OneToOne
	private Colocation colocation;
	
	private boolean done;

	public Operation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public Roommate getRoommateOwing() {
		return roommateOwing;
	}

	public void setRoommateOwing(Roommate roommateOwing) {
		this.roommateOwing = roommateOwing;
	}

	public Roommate getRoommateOwed() {
		return roommateOwed;
	}

	public void setRoommateOwed(Roommate roommateOwed) {
		this.roommateOwed = roommateOwed;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
}
