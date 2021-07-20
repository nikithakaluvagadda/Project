package com.training.daos;

import java.sql.SQLException;
import java.util.List;

import com.training.model.Customer;

public interface CrudRepository<T> {

	public int add(Customer t) throws SQLException;
	public List<T> findAll() throws SQLException;
	public T findById(int key) throws SQLException;
	public int remove(int key) throws SQLException;

}
