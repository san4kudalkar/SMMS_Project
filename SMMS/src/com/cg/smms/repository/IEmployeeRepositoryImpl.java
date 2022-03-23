package com.cg.smms.repository;

import javax.persistence.EntityManager;
//import javax.persistence.*;
import com.cg.smms.entities.Employee;

public class IEmployeeRepositoryImpl implements IEmployeeRepository

{
	//Step 1:Start JPA LifeCycle
	private EntityManager entityManager;
	
	

	public IEmployeeRepositoryImpl() 
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entityManager.find(Employee.class,id);
		return employee;
	}

	
	@Override
	public boolean deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class,id);
		entityManager.remove(employee);
		return false;
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}


}
