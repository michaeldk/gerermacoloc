package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.MessageSeenBy;
import com.gerermacoloc.app.repo.contract.MessageSeenByDao;
import com.gerermacoloc.app.service.contract.MessageSeenByService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class MessageSeenByServiceImpl extends GenericServiceImpl<MessageSeenBy> implements MessageSeenByService {

    @Autowired
    public MessageSeenByServiceImpl(final MessageSeenByDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(MessageSeenBy MessageSeenBy) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(MessageSeenBy form) throws Exception {
		// TODO Auto-generated method stub
	}

}
