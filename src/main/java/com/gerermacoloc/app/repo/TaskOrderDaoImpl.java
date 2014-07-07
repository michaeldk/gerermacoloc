package com.gerermacoloc.app.repo;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.TaskOrder;
import com.gerermacoloc.app.repo.contract.TaskOrderDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class TaskOrderDaoImpl extends GenericDaoImpl<TaskOrder> implements TaskOrderDao {

    public TaskOrderDaoImpl() {
        super(TaskOrder.class);
    }
}
