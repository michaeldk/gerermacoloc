package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.Comment;
import com.gerermacoloc.app.form.CreateCommentForm;
import com.gerermacoloc.app.service.contract.CommentService;

/**
 * The invitations controller.
 */
@Controller
@RequestMapping("/comments")
public class CommentController extends GenericControllerImpl<Comment, CreateCommentForm> {

    @Autowired
    public CommentController(final CommentService service) {
        super("comments", Comment.class.getSimpleName().toLowerCase(), service);
    }

    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
