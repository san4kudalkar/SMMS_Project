package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.Shop;

public class IShopRepositoryImpl implements IShopRepository{

	//Step 1:Start JPA LifeCycle
		private EntityManager entityManager;
		
		

		public IShopRepositoryImpl() 
		{
			entityManager=JPAUtil.getEntityManager();
		}
	
	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = entityManager.find(Shop.class,id);
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		Shop shop = entityManager.find(Shop.class,id);
		entityManager.remove(shop);
		return false;
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
