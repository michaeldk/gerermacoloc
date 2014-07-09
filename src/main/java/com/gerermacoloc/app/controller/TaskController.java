package com.gerermacoloc.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gerermacoloc.app.controller.generic.GenericControllerImpl;
import com.gerermacoloc.app.service.contract.TaskService;

/**
 * The tasks controller.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController extends GenericControllerImpl {

    @Autowired
    private TaskService service;

	@Override
	public String defaultHome(Model model, HttpSession session) {
		// TODO Auto-generated method stub
		return null;
	}
}
