package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.Task;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface TaskDao extends GenericDao<Task> {
	List<Task> findRoommateTasks(Roommate roommate);

	List<Task> findColocationTasks(Colocation coloc, Roommate roommate);
}
