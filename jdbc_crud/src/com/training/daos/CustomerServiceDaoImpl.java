package com.training.daos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerServiceDaoImpl implements CrudRepository<Customer> {
	private Connection con;

	public CustomerServiceDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(com.training.model.Customer t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findById(int key) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int remove(int key) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
