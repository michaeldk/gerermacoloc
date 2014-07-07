package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.PaymentParticipation;
import com.gerermacoloc.app.form.CreatePaymentParticipationForm;
import com.gerermacoloc.app.repo.contract.PaymentParticipationDao;
import com.gerermacoloc.app.service.contract.PaymentParticipationService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PaymentParticipationServiceImpl extends GenericServiceImpl<PaymentParticipation, CreatePaymentParticipationForm> implements PaymentParticipationService {

    @Autowired
    public PaymentParticipationServiceImpl(final PaymentParticipationDao dao) {
        super(dao);
    }

    @Override
    public CreatePaymentParticipationForm createForm() {
        return new CreatePaymentParticipationForm();
    }

    @Override
    protected PaymentParticipation populateEntity(PaymentParticipation element, CreatePaymentParticipationForm form) {
    	if (element == null) {
    		element = new PaymentParticipation();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreatePaymentParticipationForm form, final PaymentParticipation element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(PaymentParticipation PaymentParticipation) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreatePaymentParticipationForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
