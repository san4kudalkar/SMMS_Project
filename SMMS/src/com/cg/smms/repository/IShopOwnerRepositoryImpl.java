package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.ShopOwner;

public class IShopOwnerRepositoryImpl implements IShopOwnerRepository {
	
private EntityManager entityManager;
	
	//Step 1: Start JPA LifeCycle
	public IShopOwnerRepositoryImpl() 
	{
		
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		entityManager.merge(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner searchShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class,id);
		return shopOwner;
	}

	@Override
	public ShopOwner deleteShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class,id);
		entityManager.remove(shopOwner);
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
