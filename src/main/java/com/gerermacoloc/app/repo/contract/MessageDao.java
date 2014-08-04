package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface MessageDao extends GenericDao<Message> {

	List<Message> findMessages(Colocation coloc, int page);
}
