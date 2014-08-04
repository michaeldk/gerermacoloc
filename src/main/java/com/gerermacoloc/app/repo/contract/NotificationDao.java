package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Notification;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface NotificationDao extends GenericDao<Notification> {
	List<Notification> findNotifications(Roommate roommate, int page);
}
