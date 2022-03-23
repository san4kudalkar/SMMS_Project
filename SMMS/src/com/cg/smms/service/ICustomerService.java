package com.cg.smms.service;

import com.cg.smms.entities.Customer;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;


public interface ICustomerService {
	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public Customer searchCustomer(int id);

	public Customer deleteCustomer(int id);

	public Item searchItem(int id);
	
	public boolean deleteItem(int id);

	public Item addItem(Item item);
	
	public Item updateItem(Item item);

	public Mall searchMall(int id);

	public boolean deleteOrder(int id);

}
