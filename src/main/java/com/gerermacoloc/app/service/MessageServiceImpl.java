package com.gerermacoloc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.repo.contract.MessageDao;
import com.gerermacoloc.app.service.contract.MessageService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class MessageServiceImpl extends GenericServiceImpl<Message> implements MessageService {

    @Autowired
    public MessageServiceImpl(final MessageDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Message message) throws Exception {
	}

	@Override
	public List<Message> findMessages(Colocation coloc, int page) {
		return ((MessageDao) this.dao).findMessages(coloc, page);
	}

}
