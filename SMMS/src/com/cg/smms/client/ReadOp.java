package com.cg.smms.client;

//Importing the entity & service classes to defining object
import com.cg.smms.entities.*;
import com.cg.smms.service.*;

public class ReadOp {

	public static void main(String[] args) 
	{
		
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

		
		//Customer Read Operation
		customer = c_service.searchCustomer(19);
		System.out.println(
				"Customer Found: " + "ID: " + customer.getId() + "\n" + "Customer Name: " + customer.getName());
		
		//Employee Read Operation
		employee = e_service.searchEmployee(110);
		System.out.println(
				"Employee Found: " + "ID: " + employee.getId() + "\n" + "Employee Name: " + employee.getName());
  	    
		//Item Read Operation
		item = c_service.searchItem(1111);
		System.out.println(
				"Item Found: " + "ID: " + employee.getId() + "\n" + "Item Name: " + item.getItemName());
		
		//Order Read Operation
		orderdetails = o_service.searchOrder(10002);
		System.out.println(
				"Order Found: " + "ID: " + orderdetails.getId() + "\n" + "Order Date: " + orderdetails.getDateOfPurchase());
		
		//Shop Read Operation
		shop = s_service.searchShopById(302);
		System.out.println(
				"Shop Found: " + "ID: " + shop.getShopId() + "\n" + "Shop Name: " + shop.getShopName());
		
		//User Read Operation
		user = u_service.searchUser(99);
		System.out.println(
				"User Found: " + "ID: " + user.getId() + "\n" + "User Name: " + user.getName());
		
		//Mall Read Operation
		mall = a_service.searchMall(401);
		System.out.println(
				"Mall Found: " + "ID: " + mall.getId() + "\n" + "Mall Name: " + mall.getMallName());
		
		//Mall Admin Read Operation
		malladmin = a_service.searchMallAdmin(5001);
		System.out.println(
				"Mall Admin Found: " + "ID: " + malladmin.getId() + "\n" + "Mall Admin Name: " + malladmin.getName());
		
		//Shop Owner Read Operation
		shopowner = s_service.searchShopOwner(601);
		System.out.println(
				"Shop Owner Found: " + "ID: " + shopowner.getId() + "\n" + "Shop Owner Name: " + shopowner.getName());
		
	}
}
