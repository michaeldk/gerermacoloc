package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.MessageSeenBy;
import com.gerermacoloc.app.repo.contract.MessageSeenByDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class MessageSeenByDaoImpl extends GenericDaoImpl<MessageSeenBy> implements MessageSeenByDao {

    public MessageSeenByDaoImpl() {
        super(MessageSeenBy.class);
    }
}
