package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.Payment;
import com.gerermacoloc.app.form.CreatePaymentForm;
import com.gerermacoloc.app.service.contract.PaymentService;

/**
 * The payments controller.
 */
@Controller
@RequestMapping("/payments")
public class PaymentController extends GenericControllerImpl<Payment, CreatePaymentForm> {

    @Autowired
    public PaymentController(final PaymentService service) {
        super("payments", Payment.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
