package com.gerermacoloc.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Notification extends Versionable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(generator = "notification_sequence_gen")
    @SequenceGenerator(name = "notification_sequence_gen", sequenceName = "notification_id_seq")
    private int id;

	@NotNull
	@OneToOne
	private Roommate trigger;
	
	private String text;
	
	@OneToOne
	private Roommate targetRoommate;
	
	private boolean seen;
	
	@NotNull
	private String type;

	public Notification() {
		super();
	}

	public Roommate getTrigger() {
		return trigger;
	}

	public void setTrigger(Roommate trigger) {
		this.trigger = trigger;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Roommate getTargetRoommate() {
		return targetRoommate;
	}

	public void setTargetRoommate(Roommate targetRoommate) {
		this.targetRoommate = targetRoommate;
	}

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
