package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import com.example.demo.entity.Payment;
import com.example.demo.repos.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repo;
	public List<Payment> getAll(){
		return this.repo.findAll();
	}
	public Payment add( Payment entity) {
		return this.repo.save(entity);
	
}
	public Payment update( Payment entity) {
		return this.repo.save(entity);
	
}	
	public Payment remove(Payment entity) {
		Optional<Payment> found=this.repo.findById(entity.getTxnId());
		if(found.isPresent()) {
			this.repo.delete(entity);
		}else {
			throw  new NoSuchElementException("Element with that Id not available");
		}
				return entity;
	
}
	public Payment getById( int Id) {
		return this.repo.findById(Id)
				.orElseThrow(()-> new NoSuchElementException("Element with that Id  available"));
	
}
	
	public List<Payment> getByDescription(String description){
		return this.repo.findByDescriptionEquals(description);
	}
	public List<Payment> getByAmountGreaterThan(double amount){
		return this.repo.findByAmountGreaterThan(amount);
	}
	public int updateAmount( double amount,int txnId) {
		return this.repo.updateAmount(amount, txnId);
	}
	
	
	
}