package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Ping;
import com.gerermacoloc.app.repo.contract.PingDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class PingDaoImpl extends GenericDaoImpl<Ping> implements PingDao {

    public PingDaoImpl() {
        super(Ping.class);
    }

}
