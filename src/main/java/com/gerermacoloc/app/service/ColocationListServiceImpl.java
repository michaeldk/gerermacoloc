package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.repo.contract.ColocationListDao;
import com.gerermacoloc.app.service.contract.ColocationListService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class ColocationListServiceImpl extends GenericServiceImpl<ColocationList> implements ColocationListService {

    @Autowired
    public ColocationListServiceImpl(final ColocationListDao dao) {
        super(dao);
    }
    
    @Override
    public void create(ColocationList entity) throws Exception {
		verifyBusinessRules(entity);
		((ColocationListDao) this.dao).create(entity);
	}

	@Override
	public ColocationList getColocationList(Colocation coloc) {
		ColocationList entity = ((ColocationListDao) this.dao).getColocationList(coloc);
		if (entity == null) {
			entity = new ColocationList();
			entity.setColocation(coloc);
			try {
				this.create(entity);
			} catch (Exception e) {
				// won't happen
			}
		}
		return entity;
	}

	@Override
	public void verifyBusinessRules(ColocationList element) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
