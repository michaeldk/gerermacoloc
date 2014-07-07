package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Invitation;
import com.gerermacoloc.app.repo.contract.InvitationDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class InvitationDaoImpl extends GenericDaoImpl<Invitation> implements InvitationDao {

    public InvitationDaoImpl() {
        super(Invitation.class);
    }

}
