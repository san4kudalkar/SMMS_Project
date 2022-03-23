package com.cg.smms.repository;

import javax.persistence.EntityManager;
import com.cg.smms.entities.MallAdmin;


public class IMallAdminRepositoryImpl implements IMallAdminRepository{
	
	//Step 1:Start JPA LifeCycle
		private EntityManager entityManager;
		
		

		public IMallAdminRepositoryImpl() 
		{
			entityManager=JPAUtil.getEntityManager();
		}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		entityManager.merge(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin deleteMallAdmin(int id) {
		MallAdmin mallAdmin=entityManager.find(MallAdmin.class,id);
		entityManager.remove(mallAdmin);
		return null;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class,id);
		return mallAdmin;
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
