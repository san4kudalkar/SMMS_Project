package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.IUserRepositoryImpl;
import com.cg.smms.repository.IUserRepository;

public class IUserServiceImpl implements IUserService{
	
private IUserRepository dao;
	
	public IUserServiceImpl()
	{
		dao = new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
        dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
        dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User searchUser(int id) {
		User user = dao.searchUser(id);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		dao.beginTransaction();
		dao.deleteUser(id);
		dao.commitTransaction();
		return null;
	}

}
