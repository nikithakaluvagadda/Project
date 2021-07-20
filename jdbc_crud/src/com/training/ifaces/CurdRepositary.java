package com.training.ifaces;
import java.sql.SQLException;
import java.util.*;
public interface CurdRepositary<T> {
	public int add(T t) throws SQLException;
public List<T> findAll() throws SQLException;

}
