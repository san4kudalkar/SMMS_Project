package com.cg.smms.repository;

import com.cg.smms.entities.User;

public interface IUserRepository {
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User searchUser(int id);
	
	public User deleteUser(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();

}
