package com.gerermacoloc.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.controller.util.SessionData;
import com.gerermacoloc.app.domain.Message;
import com.gerermacoloc.app.domain.Roommate;
import com.gerermacoloc.app.form.ColocationForm;
import com.gerermacoloc.app.service.contract.ColocationService;
import com.gerermacoloc.app.service.contract.MessageService;

/**
 * The colocations controller.
 */
@Controller
@RequestMapping("/coloc")
public class ColocationController extends GenericControllerImpl {

    @Autowired
    private ColocationService service;
    @Autowired
    private MessageService messageService;
    
    /**
     * Retrieves the colocation ID from the user's session
     */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public String defaultHome(final Model model, HttpSession session) {
    	Roommate roommate = SessionData.findRoommate(session);
    	if (roommate == null) {
    		return "redirect:/welcome";
    	} else if (roommate.getColocation() == null) {
    		model.addAttribute("newColoc", new ColocationForm());
    		return "colocation";
    	}
    	model.addAttribute("colocation", roommate.getColocation());
    	List<Message> messages = messageService.findMessages(roommate.getColocation(), 0);
    	model.addAttribute("messages", messages);
    	return "colocation";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute("newColoc") final ColocationForm form, final BindingResult result,final Model model, HttpSession session) throws Exception {
    	Roommate roommate = SessionData.findRoommate(session);
    	if (roommate == null) {
    		return "redirect:/welcome";
    	}
    	try {
            if (!result.hasErrors()) {
                this.service.create(form, roommate);
                return "redirect:/dashboard";
            } else {
                return "colocation";
            }
        } catch (final Exception exception) {
            throw exception;
        	/*this.loadErrorContext(model, exception);
            return "colocation";*/
        }
    }
}
