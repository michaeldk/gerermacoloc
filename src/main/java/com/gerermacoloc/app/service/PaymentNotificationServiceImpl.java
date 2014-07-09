package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.PaymentNotification;
import com.gerermacoloc.app.repo.contract.PaymentNotificationDao;
import com.gerermacoloc.app.service.contract.PaymentNotificationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PaymentNotificationServiceImpl extends GenericServiceImpl<PaymentNotification> implements PaymentNotificationService {

    @Autowired
    public PaymentNotificationServiceImpl(final PaymentNotificationDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(PaymentNotification PaymentNotification) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(PaymentNotification form) throws Exception {
		// TODO Auto-generated method stub
	}

}
