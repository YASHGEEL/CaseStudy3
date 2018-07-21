package com.cg.payroll.services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.beans.Trainee;
import com.cg.payroll.daoservices.PayrollDAOServices;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

@Component(value="payrollServices")
public class PayrollServicesImpl implements PayrollServices{

	@Autowired
	private PayrollDAOServices daoServices;

	@Transactional
	@Override
	public Trainee acceptAssociateDetails(Trainee trainee) throws PayrollServicesDownException {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return daoServices.save(trainee);
	}
	
	@Transactional
	

	
	@Override
	public Trainee getAssociateDetails(int associateId)
			throws AssociateDetailsNotFoundException, PayrollServicesDownException {
		Trainee trainee = daoServices.findOne(associateId);
		if(trainee==null)throw new AssociateDetailsNotFoundException("Associate Details with Id "+associateId+" not found" );
		return trainee;
	}

	@Override
	public ArrayList<Trainee> getAllAssociatesDetails() throws PayrollServicesDownException {
		return (ArrayList<Trainee>) daoServices.findAll();
	}

	@Override
	public Trainee updateDetails(Trainee trainee) 
	{
		trainee = daoServices.save(trainee);
		return trainee;
	}



}
