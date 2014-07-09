package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Payment;
import com.gerermacoloc.app.repo.contract.PaymentDao;
import com.gerermacoloc.app.service.contract.PaymentService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PaymentServiceImpl extends GenericServiceImpl<Payment> implements PaymentService {

    @Autowired
    public PaymentServiceImpl(final PaymentDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Payment payment) throws Exception {
	}

}
