package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Ping;
import com.gerermacoloc.app.form.CreatePingForm;
import com.gerermacoloc.app.repo.contract.PingDao;
import com.gerermacoloc.app.service.contract.PingService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class PingServiceImpl extends GenericServiceImpl<Ping, CreatePingForm> implements PingService {

    @Autowired
    public PingServiceImpl(final PingDao dao) {

        super(dao);
    }

    @Override
    public CreatePingForm createForm() {

        return new CreatePingForm();
    }

    @Override
    protected Ping populateEntity(final Ping element, final CreatePingForm form) {
    	return element;
    }

    @Override
    protected void populateForm(final CreatePingForm form, final Ping element) {
    }
	
	public void verifyBusinessRules(Ping ping) throws Exception {
	}

}
