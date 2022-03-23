package com.cg.smms.client;

//Importing the entity & service classes to defining object
import com.cg.smms.entities.*;
import com.cg.smms.service.*;

public class DeleteOp {

	public static void main(String[] args) {
		
		// Declaring required instance variable
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		Item item = new Item();
		Mall mall = new Mall();
		MallAdmin malladmin = new MallAdmin();
		OrderDetails orderdetails = new OrderDetails();
		Shop shop = new Shop();
		ShopOwner shopowner = new ShopOwner();
		User user = new User();
		
		IAdminService a_service = new IAdminServiceImpl();
		ICustomerService c_service = new ICustomerServiceImpl();
		IEmployeeService e_service = new IEmployeeServiceImpl();
		IOrderService o_service = new IOrderServiceImpl();
		IShopService s_service = new IShopServiceImpl();
		IUserService u_service = new IUserServiceImpl();
		/*
		//Shop Delete Operation
		shop = s_service.searchShopById(301);
		s_service.deleteShop(301);
		
		//Employee Delete Operation
		employee = e_service.searchEmployee(10);
		e_service.deleteEmployee(10);
		
		//User Delete Operation
		user = u_service.searchUser(47);
		u_service.deleteUser(47);
		
		//Customer Delete Operation
		customer = c_service.searchCustomer(45);
		c_service.deleteCustomer(45);
		
		//Order Delete Operation
		orderdetails = o_service.searchOrder(10001);
		o_service.deleteOrder(10001);
		
		//Item Delete Operation
		item = c_service.searchItem(2111);
		c_service.deleteItem(2111);
		*/
		//MallAdmin Delete Operation
		malladmin = a_service.searchMallAdmin(5001);
		a_service.deleteMallAdmin(5001);
		
		//Mall Delete Operation
		mall = a_service.searchMall(401);
		a_service.cancelMall(401);
		
		//ShopOwner Delete Operation
		shopowner = s_service.searchShopOwner(601);
		s_service.deleteShopOwner(601);
		
	}

}
