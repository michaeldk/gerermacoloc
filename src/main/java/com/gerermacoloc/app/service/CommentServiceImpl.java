package com.gerermacoloc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Comment;
import com.gerermacoloc.app.repo.contract.CommentDao;
import com.gerermacoloc.app.service.contract.CommentService;
import com.gerermacoloc.app.service.contract.RoommateService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class CommentServiceImpl extends GenericServiceImpl<Comment> implements CommentService {

	@Autowired
	private RoommateService roommateService;
	
    @Autowired
    public CommentServiceImpl(final CommentDao dao) {
        super(dao);
    }
	
	public void verifyBusinessRules(Comment Comment) throws Exception {
	}

	@Override
	public void create(Comment entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
