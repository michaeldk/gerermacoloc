package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.repo.contract.ColocationDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class ColocationDaoImpl extends GenericDaoImpl<Colocation> implements ColocationDao {

    public ColocationDaoImpl() {

        super(Colocation.class);
    }

}
