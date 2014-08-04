package com.gerermacoloc.app.service.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.domain.Task;
import com.gerermacoloc.app.service.generic.GenericService;

public interface TaskService extends
		GenericService<Task> {
	List<Task> findRoommateTasks(Roommate roommate);
	List<Task> findColocationTasks(Colocation coloc, Roommate roommate);
}
