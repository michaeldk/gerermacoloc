package com.gerermacoloc.app.repo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Notification;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.NotificationDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class NotificationDaoImpl extends GenericDaoImpl<Notification> implements NotificationDao {

	private static final int MAX_NOTIFICATIONS = 10;
	
    public NotificationDaoImpl() {
        super(Notification.class);
    }

	@Override
	public List<Notification> findNotifications(Roommate roommate, int page) {
		int startPos = page*10;
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Notification> criteria = builder.createQuery(Notification.class);
        final Root<Notification> notificationRoot = criteria.from(Notification.class);
        criteria.select(notificationRoot);
        criteria.where(builder.equal(notificationRoot.get("targetRoommate"), roommate));

        return this.entityManager.createQuery(criteria).setFirstResult(startPos).setMaxResults(MAX_NOTIFICATIONS).getResultList();
	}
}
