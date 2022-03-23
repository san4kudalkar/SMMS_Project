package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.OrderDetails;

public class IOrderRepositoryImpl implements IOrderRepository
{
    
	//Step 1: Start JPA LifeCycle
	
	private EntityManager entityManager;
	
	public IOrderRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}

	
	// Creating Repository/DAO File
	
	@Override
	public OrderDetails addOrder(OrderDetails order) 
	{
        entityManager.persist(order);
		return order;
	}
	
   // Updating Repository
	
	@Override
	public OrderDetails updateOrder(OrderDetails order) 
	{
		entityManager.merge(order);
        return order;
	}
   
	
	// Searching id from OrderDetails Entity
	
	@Override
	public OrderDetails searchOrder(int id) 
	{
		OrderDetails order = entityManager.find(OrderDetails.class,id);
        return order;
	}

	
	// Finding order from OrderDetails and then Removing it
	
	@Override
	public OrderDetails deleteOrder(int id) 
	{
		OrderDetails order = entityManager.find(OrderDetails.class,id);
		entityManager.remove(order);
        return order;
	}

   // Begin and Commit Transaction
	
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
	}


	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
		
	}

	}

