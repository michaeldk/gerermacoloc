package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Ping;
import com.gerermacoloc.app.repo.contract.PingDao;
import com.gerermacoloc.app.service.contract.PingService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PingServiceImpl extends GenericServiceImpl<Ping> implements PingService {

    @Autowired
    public PingServiceImpl(final PingDao dao) {

        super(dao);
    }
	
	public void verifyBusinessRules(Ping ping) throws Exception {
	}

}
