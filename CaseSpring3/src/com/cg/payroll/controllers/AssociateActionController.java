package com.cg.payroll.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.Trainee;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;

@Controller
public class AssociateActionController {

	
	@Autowired(required=true)
	private PayrollServices payrollServices;
	
	@RequestMapping(value="/registerAssociate",method=RequestMethod.POST)
	public ModelAndView registerAssociate(@ModelAttribute("trainee") Trainee trainee) {
		try {
			System.out.println("@@@@@@@@@@@@@@@@@@");
			trainee =payrollServices.acceptAssociateDetails(trainee);
			ModelAndView modelAndView = new ModelAndView("registrationSuccessPage", "trainee", trainee);
			return modelAndView;
		} catch (PayrollServicesDownException e) {
			e.printStackTrace();
		}
		return new ModelAndView("errorPage");
	}
	
	@RequestMapping("/login")
	public ModelAndView getDisplayPage(@ModelAttribute("trainee") Trainee trainee) 
	{
		
		ModelAndView model = new ModelAndView("DisplayPage");
	   ArrayList<Trainee> list = new ArrayList<>();
	   try {
		list = payrollServices.getAllAssociatesDetails();
	} catch (PayrollServicesDownException e) {
		// pay
		e.printStackTrace();
	}
	    model.addObject("arrayList",list);

	    return model;
	}
	
	@RequestMapping(value="/updateAssociate",method=RequestMethod.POST)
	public ModelAndView updateAssociate(@ModelAttribute("trainee") Trainee trainee) {
	
			
			trainee = payrollServices.updateDetails(trainee);
			ModelAndView modelAndView = new ModelAndView("DisplayUpdated", "trainee", trainee);
			return modelAndView ;
		
		
	}
	
	
	
		
	
	
	
	
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
		public ModelAndView handler(@ModelAttribute("trainee") Trainee trainee) {
			System.out.println(trainee);
			//trainee = payrollServices.updateDetails(trainee);
			ModelAndView model = new ModelAndView("update","trainee",trainee);
			
			return model;
		}
	
		public Trainee getUpdatedPage(int id)
		{
			Trainee trainee = null;
			ModelAndView model = new ModelAndView("update");
			try {
				 trainee = payrollServices.getAssociateDetails(id);
				
				} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (AssociateDetailsNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PayrollServicesDownException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return trainee;
		}
	
}
