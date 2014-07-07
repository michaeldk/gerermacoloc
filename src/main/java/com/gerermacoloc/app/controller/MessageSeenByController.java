package com.gerermacoloc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.domain.MessageSeenBy;
import com.gerermacoloc.app.form.CreateMessageSeenByForm;
import com.gerermacoloc.app.service.contract.MessageSeenByService;

/**
 * The messageseenby controller.
 */
@Controller
@RequestMapping("/messageseenby")
public class MessageSeenByController extends GenericControllerImpl<MessageSeenBy, CreateMessageSeenByForm> {

    @Autowired
    public MessageSeenByController(final MessageSeenByService service) {
        super("messageseenby", MessageSeenBy.class.getSimpleName().toLowerCase(), service);
    }
    
    @Override
    protected void loadEntities(final Model model) {
        super.loadEntities(model);
    }

    @Override
    protected void populateLists(final Model model) {
    }
}
