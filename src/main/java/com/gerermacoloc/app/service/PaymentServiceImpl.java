package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Payment;
import com.gerermacoloc.app.form.CreatePaymentForm;
import com.gerermacoloc.app.repo.contract.PaymentDao;
import com.gerermacoloc.app.service.contract.PaymentService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PaymentServiceImpl extends GenericServiceImpl<Payment, CreatePaymentForm> implements PaymentService {

    @Autowired
    public PaymentServiceImpl(final PaymentDao dao) {
        super(dao);
    }

    @Override
    public CreatePaymentForm createForm() {
        return new CreatePaymentForm();
    }

    @Override
    protected Payment populateEntity(final Payment element, final CreatePaymentForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreatePaymentForm form, final Payment element) {
    }
	
	public void verifyBusinessRules(Payment payment) throws Exception {
	}

}
