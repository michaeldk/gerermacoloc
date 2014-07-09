package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.TaskOrder;
import com.gerermacoloc.app.repo.contract.TaskOrderDao;
import com.gerermacoloc.app.service.contract.TaskOrderService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class TaskOrderServiceImpl extends GenericServiceImpl<TaskOrder> implements TaskOrderService {

    @Autowired
    public TaskOrderServiceImpl(final TaskOrderDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(TaskOrder TaskOrder) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(TaskOrder entity) throws Exception {
		// TODO Auto-generated method stub
	}

}
