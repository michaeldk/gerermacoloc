package com.gerermacoloc.app.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.Task;
import com.gerermacoloc.app.repo.contract.TaskDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class TaskDaoImpl extends GenericDaoImpl<Task> implements TaskDao {

    public TaskDaoImpl() {
        super(Task.class);
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> findRoommateTasks(Roommate roommate) {
		return this.entityManager.createQuery("SELECT to.task FROM TaskOrder to JOIN to.doers r WHERE :id = r.id").setParameter("id", roommate.getId()).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> findColocationTasks(Colocation coloc, Roommate roommate) {
		return this.entityManager.createQuery("SELECT to.task FROM TaskOrder to JOIN to.doers r WHERE (:id = r.id AND to.task.privateTask = TRUE) OR to.task.privateTask = FALSE").setParameter("id", roommate.getId()).getResultList();
	}

}
