package com.gerermacoloc.app.service.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Notification;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.service.generic.GenericService;

public interface NotificationService extends
		GenericService<Notification> {

	List<Notification> findNotification(Roommate roommate, int page);
}
