package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.IEmployeeRepositoryImpl;
import com.cg.smms.repository.IEmployeeRepository;

public class IEmployeeServiceImpl implements IEmployeeService
{
	//Establishing connection between Service and Repository
	 private IEmployeeRepository dao;
	 
	public IEmployeeServiceImpl() 
	{
		dao = new IEmployeeRepositoryImpl();
		
	}
	
	
	@Override
	public Employee addEmployee(Employee employee) 
	{
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) 
	{
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		return false;
	}
	
}
