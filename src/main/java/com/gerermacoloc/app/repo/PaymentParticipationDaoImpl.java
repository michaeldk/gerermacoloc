package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.PaymentParticipation;
import com.gerermacoloc.app.repo.contract.PaymentParticipationDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class PaymentParticipationDaoImpl extends GenericDaoImpl<PaymentParticipation> implements PaymentParticipationDao {

    public PaymentParticipationDaoImpl() {
        super(PaymentParticipation.class);
    }
}
