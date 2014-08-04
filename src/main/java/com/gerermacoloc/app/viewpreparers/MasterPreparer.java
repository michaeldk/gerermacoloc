package com.gerermacoloc.app.viewpreparers;

import java.util.List;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gerermacoloc.app.domain.Notification;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.form.LoginForm;
import com.gerermacoloc.app.service.contract.NotificationService;

@Component
public class MasterPreparer implements ViewPreparer {

	@Autowired
	private NotificationService notificationService;

	@Override
	public void execute(TilesRequestContext tilesContext,
			AttributeContext attributeContext) {
		Roommate roommate = (Roommate) tilesContext.getSessionScope().get(
				"user");
		if (roommate == null) {
			tilesContext.getRequestScope().remove("user");
			tilesContext.getRequestScope().put("loginForm", new LoginForm());
		} else {
			List<Notification> notifications = notificationService.findNotification(roommate, 0);
			tilesContext.getRequestScope().put("notifications", notifications);
			tilesContext.getRequestScope().put("unreadNotifications", numberOfUnreadNotifications(notifications));
		}

		// Or you can add it as attribute for the view
		// attributeContext.putAttribute("rowsFromDb", new Attribute(), true);

	}
	
	private int numberOfUnreadNotifications(List<Notification> notifications) {
		int number = 0;
		for (Notification noti : notifications) {
			if (!noti.isSeen()) {
				number++;
			}
		}
		return number;
	}

}