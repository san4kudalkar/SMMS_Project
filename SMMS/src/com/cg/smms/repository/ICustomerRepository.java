package com.cg.smms.repository;

import com.cg.smms.entities.Customer;

//Defining a interface ICustomerRepository
public interface ICustomerRepository 
{
	// Declaring abstract methods
	
public Customer addCustomer(Customer customer);

public Customer updateCustomer(Customer customer);

public Customer searchCustomer(int id);

public Customer deleteCustomer(int id);

public abstract void beginTransaction();

public abstract void commitTransaction();


}
