package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.form.ColocationForm;
import com.gerermacoloc.app.repo.contract.ColocationDao;
import com.gerermacoloc.app.service.contract.ColocationService;
import com.gerermacoloc.app.service.contract.RoommateService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ColocationServiceImpl extends GenericServiceImpl<Colocation> implements ColocationService {

	@Autowired
	private RoommateService roommateService;
	
    @Autowired
    public ColocationServiceImpl(final ColocationDao dao) {
        super(dao);
    }

    @Override
    public void verifyBusinessRules(Colocation colocation) throws Exception {
	}

	@Override
	public Colocation create(ColocationForm form, Roommate creator) throws Exception {
		Colocation newEntity = form2Entity(form);
		verifyBusinessRules(newEntity);
		((ColocationDao) this.dao).create(newEntity);
		creator.setColocation(newEntity);
		creator.addRole("ROLE_COLOCATION_ADMIN");
		roommateService.update(creator);
		return null;
	}
	
	private Colocation form2Entity(ColocationForm form) {
		Colocation coloc = new Colocation();
		coloc.setAdresse(form.getAddress());
		coloc.setAdresseProprietaire(form.getAddressProprio());
		coloc.setEmail(form.getEmailColoc());
		coloc.setEmailProprietaire(form.getEmailProprio());
		coloc.setName(form.getName());
		coloc.setProprietaire(form.getNameProprio());
		return coloc;
	}
	
}
