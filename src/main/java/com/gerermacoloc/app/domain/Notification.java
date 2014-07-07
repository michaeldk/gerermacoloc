package com.gerermacoloc.app.domain;

public interface Notification {
	NotificationType getType();
	String getContent();
	String getSmallContent();
}
