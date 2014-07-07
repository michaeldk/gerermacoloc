package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.ColocationList;
import com.gerermacoloc.app.repo.contract.ColocationListDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class ColocationListDaoImpl extends GenericDaoImpl<ColocationList> implements ColocationListDao {

    public ColocationListDaoImpl() {
        super(ColocationList.class);
    }
}
