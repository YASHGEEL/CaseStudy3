package com.cg.payroll.services;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.Trainee;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
public interface PayrollServices {

	Trainee acceptAssociateDetails(Trainee trainee) throws PayrollServicesDownException;

	Trainee updateDetails(Trainee trainee) ;

	Trainee getAssociateDetails(int associateId)throws AssociateDetailsNotFoundException , 
	PayrollServicesDownException;

	ArrayList<Trainee> getAllAssociatesDetails()throws PayrollServicesDownException;

}