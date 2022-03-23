package com.cg.smms.service;

import com.cg.smms.entities.Item;
//import com.cg.smms.entities.Mall;

import com.cg.smms.entities.OrderDetails;
import com.cg.smms.repository.IOrderRepository;
import com.cg.smms.repository.IOrderRepositoryImpl;
import com.cg.smms.repository.IMallRepository;
import com.cg.smms.repository.IMallRepositoryImpl;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IItemRepositoryImpl;

public class IOrderServiceImpl implements IOrderService


// Step 1: Establishing Connection between service and repository file

{
    private IOrderRepository dao;
    private IMallRepository cao;
    private IItemRepository bao;
    
	public IOrderServiceImpl() 
    {
		dao = new IOrderRepositoryImpl();
		cao = new IMallRepositoryImpl();
		bao = new IItemRepositoryImpl();
	}
 
// Step 2: Service calls to perform CRUD Operation	
	
	@Override
	public OrderDetails addOrder(OrderDetails order) 
	{
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}

	
	
	@Override
	public OrderDetails updateOrder(OrderDetails order) 
	{
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	}

	
	
	@Override
	public OrderDetails searchOrder(int id) 
	{
		OrderDetails order= dao.searchOrder(id);
		return order;
	}

	@Override
	public boolean cancelMall(int id) 
	{
		cao.beginTransaction();
		cao.cancelMall(id);
		cao.commitTransaction();
		return false;
	}

	@Override
	public Item addItem(Item item) 
	{
		bao.beginTransaction();
		bao.addItem(item);
		bao.commitTransaction();
		return item;
	}

	@Override
	public boolean deleteOrder(int id) {
		dao.beginTransaction();
		dao.deleteOrder(id);
		dao.commitTransaction();
		return false;
	}

	
}
