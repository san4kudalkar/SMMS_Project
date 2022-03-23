package com.cg.smms.repository;

import com.cg.smms.entities.ShopOwner;

public interface IShopOwnerRepository 
{

	public ShopOwner addShopOwner(ShopOwner shopOwner);
	
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	
	public ShopOwner searchShopOwner(int id);
	
	public ShopOwner deleteShopOwner(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();
	
}
