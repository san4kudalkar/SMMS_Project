package com.cg.smms.service;


import com.cg.smms.entities.OrderDetails;
import com.cg.smms.entities.Item;


public interface IOrderService 
{
	
	public OrderDetails addOrder(OrderDetails order);
	
	public OrderDetails updateOrder(OrderDetails order);
	
	public OrderDetails searchOrder(int id);
	
	public boolean deleteOrder(int id);
	
	public boolean cancelMall(int id);
	
	public Item addItem(Item item);

}
