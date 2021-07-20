package com.training;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import com.training.daos.CustomerRepositoryImpl;
import com.training.model.Customer;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getOracleConnection();
		CustomerRepositoryImpl dao=new CustomerRepositoryImpl(con);
		int ch=1;
		try {
			if(ch==1) {
				dao.add(new Customer(1,"nikitha","nikitha@gmail.com"));
				dao.add(new Customer(2,"gopi","gopi@gmail.com"));
			}
			if(ch==2) {
				List<Customer>list=dao.findAll();
				for(Customer eachCustomer:list) {
							System.out.println(eachCustomer);
				}
			}
			if(ch==3) {
			Customer cust=dao.findById(1);
			
				System.out.println(cust);
			
			}
			if(ch==4) {
				if(dao.remove(1)==1) {
					System.out.println("customer removed");
				}
				else {
					System.out.println("customer not exixts");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
