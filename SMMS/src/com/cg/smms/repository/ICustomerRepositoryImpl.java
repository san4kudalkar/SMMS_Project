package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.Customer;

public class ICustomerRepositoryImpl implements ICustomerRepository {
	
private EntityManager entityManager;
	
	//Step 1: Start JPA LifeCycle
	public ICustomerRepositoryImpl() 
	{
		
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer = entityManager.find(Customer.class,id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		Customer customer = entityManager.find(Customer.class,id);
		entityManager.remove(customer);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
