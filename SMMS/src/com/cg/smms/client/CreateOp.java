package com.cg.smms.client;

//Importing the entity & service classes to defining object
import com.cg.smms.entities.*;
import com.cg.smms.service.*;
import java.time.LocalDate;

public class CreateOp {
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
	
	//User Add operation
	user.setId(113);
	user.setName("Pratik");
	user.setType("Non Prime");
	user.setPassword("Pratik@2010");
	
	u_service.addUser(user);
	
	//Customer Add operation
	customer.setId(130);
	customer.setName("Mahendra");
	customer.setPhone("7589452084");
	customer.setEmail("Heli800");
	
	c_service.addCustomer(customer);
	
	//Employee Add operation
	employee.setId(111);
	employee.setName("Siddhant");
	employee.setDob(LocalDate.of(1999, 02, 02));
	employee.setSalary(20000);
	employee.setAddress("Sangli");
	employee.setDesignation("Manager");
	
	e_service.addEmployee(employee);
	
	//Item Add operation
	item.setId(2112);
	item.setItemName("Redmi");
	item.setPrice(15000);
	item.setManufacturingDate(LocalDate.of(2016, 06, 06));
	item.setExpiry(LocalDate.of(2024, 06, 06));
	item.setCategory("MOBILES");
	
	o_service.addItem(item);
	
	//Order Add operation
	orderdetails.setId(10002);
	orderdetails.setDateOfPurchase(LocalDate.of(2022, 03, 03));
	orderdetails.setTotal(15000);
	orderdetails.setPaymentMode("UPI");
	
	o_service.addOrder(orderdetails);
	
	//Shop Add operation
	shop.setShopId(302);
	shop.setShopCategory("RETAIL");
	shop.setShopName("Sagar Electronics");
	shop.setShopStatus("OPEN");
	shop.setLeaseStatus("VALID");
	
	s_service.addShop(shop);
	
	//Mall Add operation
	mall.setId(402);
	mall.setMallName("Grand Central");
	mall.setLocation("Seawoods");
	mall.setCategories("REGIONAL");
	
	a_service.addMall(mall);
	
	//Mall Admin Add Operation
	malladmin.setId(5002);
	malladmin.setName("Rakesh");
	malladmin.setPhone("9420557900");
	malladmin.setPassword("grand@cent5001");
	
	a_service.addMallAdmin(malladmin);
	
	//Shop Owner Add Operation
	shopowner.setId(602);
	shopowner.setName("Pranjal");
	shopowner.setAddress("Nerul");
	shopowner.setDob(LocalDate.of(1996, 11, 22));
	
	s_service.addShopOwner(shopowner);
	}
}
