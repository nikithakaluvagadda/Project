package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.training.ifaces.CurdRepositary;
import com.training.model.Customer;
public class CustomerRepositoryImpl implements CrudRepository<Customer> {

	private Connection con;

	
	
	public CustomerRepositoryImpl(Connection con) {
		super();
		this.con = con;
	}
	@Override
	public int add(Customer t) throws SQLException{
		String sql= "insert into customer values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,t.getId());
		pstmt.setString(2, t.getCustomerName());
		pstmt.setString(3,t.getEmail());
		int rowAdded=pstmt.executeUpdate();
		return rowAdded;
		}
	@Override
	public List<Customer> findAll() throws SQLException {
		List<Customer> custList=new ArrayList<>();
		String sql="select * from customer";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String CustomerName=rs.getString("customerName");
			String email=rs.getString("email");
			custList.add(new Customer(id,CustomerName,email));
		}
		return custList;
	}
	
	public Connection getCon() {
		return con;

	}
	public void setCon(Connection con) {
		this.con=con;
	}
	@Override
	public Customer findById(int key) throws SQLException {
		Customer cust=null;
		String sql="select * from customer where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,key);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			String CustomerName=rs.getString("customerName");
			String email=rs.getString("email");
			int id=rs.getInt("id");
			cust=new Customer(id,CustomerName,email);
		}
		return cust;
	}
	@Override
	public int remove(int key) throws SQLException {
		// TODO Auto-generated method stub
		int rowdeleted=0;
		String sql="delete from customer where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,key);
		rowdeleted=pstmt.executeUpdate();
		return rowdeleted;
	}
	
	
	
}
