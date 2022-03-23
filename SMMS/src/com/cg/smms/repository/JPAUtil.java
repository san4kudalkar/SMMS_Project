package com.cg.smms.repository;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class JPAUtil
{
	// Declaring instance variable
	private static EntityManagerFactory factory;
	
	private static EntityManager entityManager;
	
	// Static block to create factory manager which is required for creation of entity manager
	static
	{
		
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		
	}
	
	// Static method to return new entityManager
	public static EntityManager getEntityManager()
	{
		
	if(entityManager==null || !entityManager.isOpen()) {
	entityManager = factory.createEntityManager();
	
	}
	return entityManager;
	
	}

}