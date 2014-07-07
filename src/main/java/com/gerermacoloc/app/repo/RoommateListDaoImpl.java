package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.RoommateList;
import com.gerermacoloc.app.repo.contract.RoommateListDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class RoommateListDaoImpl extends GenericDaoImpl<RoommateList> implements RoommateListDao {

    public RoommateListDaoImpl() {
        super(RoommateList.class);
    }
}
