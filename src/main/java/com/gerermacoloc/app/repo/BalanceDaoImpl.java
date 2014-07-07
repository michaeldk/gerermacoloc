package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Balance;
import com.gerermacoloc.app.repo.contract.BalanceDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class BalanceDaoImpl extends GenericDaoImpl<Balance> implements BalanceDao {

    public BalanceDaoImpl() {
        super(Balance.class);
    }
}
