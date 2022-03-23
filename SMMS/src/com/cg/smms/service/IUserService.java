package com.cg.smms.service;

import com.cg.smms.entities.User;

public interface IUserService 
{
	public User addUser(User user);
	
	public User searchUser(int id);
	
	public User updateUser(User user);
	
	public User deleteUser(int id);
	
}
