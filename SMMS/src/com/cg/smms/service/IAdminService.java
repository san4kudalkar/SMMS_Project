package com.cg.smms.service;

import com.cg.smms.entities.Mall;
import com.cg.smms.entities.MallAdmin;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;

//Defining a interface IAdminService
public interface IAdminService {
	
	public boolean approveNewShop(Shop shop);
	
	public User updateUser(User user);
	
    public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	
	public boolean deleteMallAdmin(int id);
	
	public MallAdmin searchMallAdmin(int id);
	
	public Mall addMall(Mall mall);

	public Mall updateMall(Mall mall);

	public Mall searchMall(int id);

	public boolean cancelMall(int id);
	
}
