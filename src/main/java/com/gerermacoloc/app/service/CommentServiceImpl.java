package com.gerermacoloc.app.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerermacoloc.app.domain.Comment;
import com.gerermacoloc.app.form.CreateCommentForm;
import com.gerermacoloc.app.repo.contract.CommentDao;
import com.gerermacoloc.app.service.contract.CommentService;
import com.gerermacoloc.app.service.contract.RoommateService;
import com.gerermacoloc.app.service.generic.GenericServiceImpl;

@Service
public class CommentServiceImpl extends GenericServiceImpl<Comment, CreateCommentForm> implements CommentService {

	@Autowired
	private RoommateService roommateService;
	
    @Autowired
    public CommentServiceImpl(final CommentDao dao) {
        super(dao);
    }

    @Override
    public CreateCommentForm createForm() {
        return new CreateCommentForm();
    }

    @Override
    protected Comment populateEntity(Comment element, CreateCommentForm form) {
    	if (element == null) {
    		element = new Comment();
    	}
    	element.setAuthor(roommateService.findById(form.getAuthor_id()));
    	element.setContent(form.getContent());
    	Calendar date = null;
    	if (form.getDate() != null) {
    		date = new GregorianCalendar();
    		date.setTime(form.getDate());
        	element.setDate(date);
        } else {
        	element.setDate(null);
        }
    	return element;
    }

    @Override
    protected void populateForm(final CreateCommentForm form, final Comment element) {
    }
	
	public void verifyBusinessRules(Comment Comment) throws Exception {
	}

	@Override
	public void create(CreateCommentForm form) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
