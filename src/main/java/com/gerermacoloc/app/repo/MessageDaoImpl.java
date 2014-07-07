package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.repo.contract.MessageDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class MessageDaoImpl extends GenericDaoImpl<Message> implements MessageDao {

    public MessageDaoImpl() {
        super(Message.class);
    }

}
