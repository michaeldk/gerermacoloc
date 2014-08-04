package com.gerermacoloc.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Task extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "task_sequence_gen")
    @SequenceGenerator(name = "task_sequence_gen", sequenceName = "task_id_seq")
    private int id;
	
	@NotBlank
	private String name;
	
	private String description;
	
	@NotNull
	@OneToOne
	private Colocation colocation;
	
	@NotNull
	@OneToOne
	private Roommate creator;
	
	private Rotation rotation;
	
	private boolean recurrent;
	
	private boolean privateTask;
	
	@OneToOne
	private TaskOrder currentTaskOrder;
	
	public Task() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}

	public Rotation getRotation() {
		return rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public TaskOrder getCurrentTaskOrder() {
		return currentTaskOrder;
	}

	public void setCurrentTaskOrder(TaskOrder currentTaskOrder) {
		this.currentTaskOrder = currentTaskOrder;
	}

	public boolean isRecurrent() {
		return recurrent;
	}

	public void setRecurrent(boolean recurrent) {
		this.recurrent = recurrent;
	}

	public Roommate getCreator() {
		return creator;
	}

	public void setCreator(Roommate creator) {
		this.creator = creator;
	}

	public boolean isPrivateTask() {
		return privateTask;
	}

	public void setPrivateTask(boolean privateTask) {
		this.privateTask = privateTask;
	}
}
