package com.gerermacoloc.app.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gerermacoloc.app.domain.Comment;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.repo.contract.CommentDao;
import com.gerermacoloc.app.repo.generic.GenericDaoImpl;

@Repository
public class CommentDaoImpl extends GenericDaoImpl<Comment> implements CommentDao {

    public CommentDaoImpl() {
        super(Comment.class);
    }

	@Override
	public List<Comment> findByMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findByAuthor(Roommate author) {
		// TODO Auto-generated method stub
		return null;
	}

}
