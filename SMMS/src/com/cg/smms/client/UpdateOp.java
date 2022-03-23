package com.cg.smms.client;


import java.time.LocalDate;

//Importing the entity & service classes to defining object
import com.cg.smms.entities.*;
import com.cg.smms.service.*;

public class UpdateOp {

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

		//Customer Update Operation
		customer = c_service.searchCustomer(19);
		customer.setName("Satish");
		customer.setPhone("7900560085");
		customer.setEmail("satish@gmail.com");
		
		c_service.updateCustomer(customer);
		
		//Employee Update Operation
		employee = e_service.searchEmployee(110);
		employee.setName("Rakesh");
		employee.setSalary(50000);
		employee.setAddress("Mumbai");
		employee.setDesignation("Store Manager");
		employee.setDob(LocalDate.of(1995, 02, 01));
		
		e_service.updateEmployee(employee);
		
		//Item Update Operation
		item = c_service.searchItem(1111);
		item.setItemName("Samsung");
		item.setPrice(25000);
		item.setManufacturingDate(LocalDate.of(2017, 06, 06));
		item.setExpiry(LocalDate.of(2025, 06, 06));
		item.setCategory("MOBILES");
		
		c_service.updateItem(item);
		
		//Order Update Operation
		orderdetails = o_service.searchOrder(10002);
		orderdetails.setDateOfPurchase(LocalDate.of(2021, 04, 05));
		orderdetails.setTotal(25000);
		orderdetails.setPaymentMode("CASH");
		
		o_service.updateOrder(orderdetails);
		
		//Shop Update Operation
		shop = s_service.searchShopById(302);
		shop.setShopCategory("WHOLESALE");
		shop.setShopName("SS Electronics");
		shop.setShopStatus("OPEN");
		shop.setLeaseStatus("VALID");
		
		s_service.updateShop(shop);
		
		//User Update Operation
		user = u_service.searchUser(99);
		user.setName("Atharva");
		user.setType("Prime");
		user.setPassword("Adi@2010");
		
		u_service.updateUser(user);
		
		//Mall Update Operation
		mall = a_service.searchMall(401);
		mall.setMallName("R City");
		mall.setLocation("Ghatkopar");
		mall.setCategories("SUPER REGIONAL");
		
		a_service.updateMall(mall);
		
		//Mall Admin Update Operation
		malladmin = a_service.searchMallAdmin(5001);
		malladmin.setName("Sakshi");
		malladmin.setPhone("8500567824");
		malladmin.setPassword("r@city5001");
		
	    a_service.updateMallAdmin(malladmin);
	    
	    //Shop Owner Update Operation
	    shopowner = s_service.searchShopOwner(601);
	    shopowner.setName("Prathamesh");
		shopowner.setAddress("Mulund");
		shopowner.setDob(LocalDate.of(1997, 03, 05));
		
		s_service.updateShopOwner(shopowner);
	    
	}
	

}
