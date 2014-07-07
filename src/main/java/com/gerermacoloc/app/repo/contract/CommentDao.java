package com.gerermacoloc.app.repo.contract;

import java.util.List;

import com.gerermacoloc.app.domain.Comment;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.generic.GenericDao;

public interface CommentDao extends GenericDao<Comment> {
	List<Comment> findByMessage(Message message);
	List<Comment> findByAuthor(Roommate author);
}
