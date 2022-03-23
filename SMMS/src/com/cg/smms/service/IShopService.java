package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.ShopOwner;

public interface IShopService {
	
public Shop addShop(Shop shop);

public Shop updateShop(Shop shop);

public Shop searchShopById(int id);

public boolean deleteShop(int id);

public boolean addEmployee(Employee employee);

public boolean updateEmployee(Employee employee);

public Item addItem(Item item);

public ShopOwner addShopOwner(ShopOwner shopOwner);

public ShopOwner updateShopOwner(ShopOwner shopOwner);

public ShopOwner searchShopOwner(int id);

public boolean deleteShopOwner(int id);


}
