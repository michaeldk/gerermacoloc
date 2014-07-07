package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Payment;
import com.gerermacoloc.app.repo.contract.PaymentDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class PaymentDaoImpl extends GenericDaoImpl<Payment> implements PaymentDao {

    public PaymentDaoImpl() {
        super(Payment.class);
    }

}
