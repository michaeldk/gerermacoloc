package com.gerermacoloc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Notification;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.NotificationDao;
import com.gerermacoloc.app.service.contract.NotificationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class NotificationServiceImpl extends GenericServiceImpl<Notification> implements NotificationService {

    @Autowired
    public NotificationServiceImpl(final NotificationDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Notification notification) throws Exception {
	}

	@Override
	public List<Notification> findNotification(Roommate roommate, int page) {
		return ((NotificationDao) this.dao).findNotifications(roommate, page);
	}
}
