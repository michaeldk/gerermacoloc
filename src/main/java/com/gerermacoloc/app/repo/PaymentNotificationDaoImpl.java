package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.PaymentNotification;
import com.gerermacoloc.app.repo.contract.PaymentNotificationDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class PaymentNotificationDaoImpl extends GenericDaoImpl<PaymentNotification> implements PaymentNotificationDao {

    public PaymentNotificationDaoImpl() {
        super(PaymentNotification.class);
    }
}
