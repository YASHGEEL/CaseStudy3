package com.cg.payroll.daoservices;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.Trainee;
public interface PayrollDAOServices extends JpaRepository<Trainee, Integer>{}