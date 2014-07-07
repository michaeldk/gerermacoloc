package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.PaymentParticipation;
import com.gerermacoloc.app.form.CreatePaymentParticipationForm;
import com.gerermacoloc.app.service.contract.PaymentParticipationService;

/**
 * The paymentParticipations controller.
 */
@Controller
@RequestMapping("/paymentParticipations")
public class PaymentParticipationController extends GenericControllerImpl<PaymentParticipation, CreatePaymentParticipationForm> {

    @Autowired
    public PaymentParticipationController(final PaymentParticipationService service) {
        super("paymentParticipations", PaymentParticipation.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
