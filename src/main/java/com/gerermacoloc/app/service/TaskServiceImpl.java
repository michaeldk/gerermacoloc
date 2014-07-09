package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Task;
import com.gerermacoloc.app.repo.contract.TaskDao;
import com.gerermacoloc.app.service.contract.TaskService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class TaskServiceImpl extends GenericServiceImpl<Task> implements TaskService {

    @Autowired
    public TaskServiceImpl(final TaskDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Task task) throws Exception {
	}

}
