package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.ListObject;
import com.gerermacoloc.app.repo.contract.ListObjectDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class ListObjectDaoImpl extends GenericDaoImpl<ListObject> implements ListObjectDao {

    public ListObjectDaoImpl() {
        super(ListObject.class);
    }
}
