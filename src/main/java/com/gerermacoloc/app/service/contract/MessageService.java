package com.gerermacoloc.app.service.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Colocation;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.service.generic.GenericService;

public interface MessageService extends
		GenericService<Message> {

	List<Message> findMessages(Colocation coloc, int page);
}
