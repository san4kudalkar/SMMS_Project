package com.cg.smms.service;


import com.cg.smms.entities.Customer;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IItemRepositoryImpl;
import com.cg.smms.repository.IOrderRepository;
import com.cg.smms.repository.IOrderRepositoryImpl;
import com.cg.smms.repository.IMallRepository;
import com.cg.smms.repository.IMallRepositoryImpl;
import com.cg.smms.repository.ICustomerRepository;
import com.cg.smms.repository.ICustomerRepositoryImpl;


public class ICustomerServiceImpl implements ICustomerService {

private ICustomerRepository dao;
private IItemRepository cao;
private IOrderRepository bao;
private IMallRepository gao;

	public ICustomerServiceImpl()
	{
		dao = new ICustomerRepositoryImpl();
		cao = new IItemRepositoryImpl();
		bao = new IOrderRepositoryImpl();
		gao = new IMallRepositoryImpl();
	} 
	
	@Override
	public Item addItem(Item item) {
		cao.beginTransaction();
		cao.addItem(item);
		cao.commitTransaction();
		return item;
	}

	@Override
	public Item searchItem(int id) {
		Item item = cao.searchItem(id);
		return item;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = gao.searchMall(id);
		return mall;
	}

	@Override
	public boolean deleteOrder(int id) {
		bao.beginTransaction();
		bao.deleteOrder(id);
		bao.commitTransaction();
		return false;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer =dao.searchCustomer(id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		dao.beginTransaction();
		dao.deleteCustomer(id);
		dao.commitTransaction();
		return null;
	}
	
	@Override
	public boolean deleteItem(int id) {
		cao.beginTransaction();
		cao.deleteItem(id);
		cao.commitTransaction();
		return false;
}

	@Override
	public Item updateItem(Item item) {
		cao.beginTransaction();
		cao.updateItem(item);
		cao.commitTransaction();
		return item;
	}
}
