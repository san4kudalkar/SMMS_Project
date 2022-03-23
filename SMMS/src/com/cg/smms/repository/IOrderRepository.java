package com.cg.smms.repository;


import com.cg.smms.entities.OrderDetails;

public interface IOrderRepository 
{

	public OrderDetails addOrder(OrderDetails order);
	
	public OrderDetails updateOrder(OrderDetails order);
	
	public OrderDetails searchOrder(int id);
	
	public OrderDetails deleteOrder(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();

}

