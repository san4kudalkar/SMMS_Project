package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.User;

public class IUserRepositoryImpl implements IUserRepository{
	
private EntityManager entityManager;
	
	//Step 1: Start JPA LifeCycle
	public IUserRepositoryImpl() 
	{
		
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}
	
	@Override
	public User searchUser(int id) {
		User user = entityManager.find(User.class,id);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		User user=entityManager.find(User.class,id);
		entityManager.remove(user);
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
