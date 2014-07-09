package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.PaymentParticipation;
import com.gerermacoloc.app.repo.contract.PaymentParticipationDao;
import com.gerermacoloc.app.service.contract.PaymentParticipationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PaymentParticipationServiceImpl extends GenericServiceImpl<PaymentParticipation> implements PaymentParticipationService {

    @Autowired
    public PaymentParticipationServiceImpl(final PaymentParticipationDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(PaymentParticipation PaymentParticipation) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(PaymentParticipation entity) throws Exception {
		// TODO Auto-generated method stub
	}

}
