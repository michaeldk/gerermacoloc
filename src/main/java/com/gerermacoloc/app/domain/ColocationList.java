package com.gerermacoloc.app.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class ColocationList extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "coloclist_sequence_gen")
    @SequenceGenerator(name = "coloclist_sequence_gen", sequenceName = "coloclist_id_seq")
	private int id;
	
	@OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
	private List<ListObject> list;
    
    @NotNull
	@OneToOne
	private Colocation colocation;
    
    public ColocationList() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ListObject> getList() {
		return list;
	}

	public void setList(List<ListObject> list) {
		this.list = list;
	}

	public Colocation getColocation() {
		return colocation;
	}

	public void setColocation(Colocation colocation) {
		this.colocation = colocation;
	}
	
	public int getNbrTodoItems() {
		int nbr = 0;
		if (this.list == null) {
			return 0;
		}
		for (ListObject obj : this.list) {
			if (!obj.isDone()) {
				nbr++;
			}
		}
		return nbr;
	}
	
	public int getNbrDoneItems() {
		int nbr = 0;
		if (this.list == null) {
			return 0;
		}
		for (ListObject obj : this.list) {
			if (obj.isDone()) {
				nbr++;
			}
		}
		return nbr;
	}
}
