package com.cg.smms.repository;

import com.cg.smms.entities.Item;

//Defining a interface IItemRepository
public interface IItemRepository 
{
	// Declaring abstract methods
	public Item addItem(Item item);
	
	public Item updateItem(Item item);
	
	public Item searchItem(int id);
	
	public Item deleteItem(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();
	
}
