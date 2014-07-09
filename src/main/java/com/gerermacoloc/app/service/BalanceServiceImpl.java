package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Balance;
import com.gerermacoloc.app.repo.contract.BalanceDao;
import com.gerermacoloc.app.service.contract.BalanceService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class BalanceServiceImpl extends GenericServiceImpl<Balance> implements BalanceService {

    @Autowired
    public BalanceServiceImpl(final BalanceDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Balance Balance) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Balance entity) throws Exception {
		// TODO Auto-generated method stub
	}
}
