package com.cg.smms.service;

import com.cg.smms.entities.Mall;
import com.cg.smms.entities.MallAdmin;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.IShopRepositoryImpl;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.IUserRepositoryImpl;
import com.cg.smms.repository.IMallRepository;
import com.cg.smms.repository.IMallRepositoryImpl;
import com.cg.smms.repository.IMallAdminRepository;
import com.cg.smms.repository.IMallAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
	
	//Establishing connection between Service and Repository
		 private IShopRepository dao;
		 private IUserRepository cao;
		 private IMallRepository bao;
		 private IMallAdminRepository gao;
		 
		public IAdminServiceImpl() 
		{
			dao = new IShopRepositoryImpl();
			cao = new IUserRepositoryImpl();
			bao = new IMallRepositoryImpl();
			gao = new IMallAdminRepositoryImpl();
		}

	@Override
	public boolean approveNewShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return true;
	}

	@Override
	public User updateUser(User user) {
		cao.beginTransaction();
		cao.updateUser(user);
		cao.commitTransaction();
		return user;
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		gao.beginTransaction();
		gao.addMallAdmin(mallAdmin);
		gao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		gao.beginTransaction();
		gao.updateMallAdmin(mallAdmin);
		gao.commitTransaction();
		return mallAdmin;
	}

	@Override
	public boolean deleteMallAdmin(int id) {
		gao.beginTransaction();
		gao.deleteMallAdmin(id);
		gao.commitTransaction();
		return false;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = gao.searchMallAdmin(id);
		return mallAdmin;
	}

	@Override
	public Mall addMall(Mall mall) {
		bao.beginTransaction();
		bao.addMall(mall);
		bao.commitTransaction();
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		bao.beginTransaction();
		bao.updateMall(mall);
		bao.commitTransaction();
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = bao.searchMall(id);
		return mall;
	}

	@Override
	public boolean cancelMall(int id) {
		bao.beginTransaction();
		bao.cancelMall(id);
		bao.commitTransaction();
		return false;
	}

}
