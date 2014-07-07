package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Task;
import com.gerermacoloc.app.repo.contract.TaskDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class TaskDaoImpl extends GenericDaoImpl<Task> implements TaskDao {

    public TaskDaoImpl() {
        super(Task.class);
    }

}
