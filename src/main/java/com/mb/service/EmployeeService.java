package com.mb.service;

import org.springframework.stereotype.Service;

import com.mb.Entity.Address;
import com.mb.Entity.Emp;
import com.mb.repo.AddRepo;
import com.mb.repo.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	private EmpRepo empRepo;
	private AddRepo addRepo;
	public EmployeeService(EmpRepo empRepo, AddRepo addRepo) {
		super();
		this.empRepo = empRepo;
		this.addRepo = addRepo;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		Emp emp = new Emp();
		emp.setEname("Ash");
		emp.setEsal(25000.00);
		Emp savedEntity = empRepo.save(emp);
		
		int i = 10/0;
		
		Address addr = new Address();
		addr.setCity("BLR");
		addr.setState("TG");
		addr.setCountry("IN");
		addr.setType("Present");
		addr.setEmpId(savedEntity.getEid());
		addRepo.save(addr);
		
	}
}
