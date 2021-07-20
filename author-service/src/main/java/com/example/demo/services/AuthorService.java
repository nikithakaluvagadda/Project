package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;
import com.example.demo.repos.AuthorRepository;


@Service
public class AuthorService {
	@Autowired
	private AuthorRepository repo;
	public List<Author> getAll(){
		return this.repo.findAll();
	}
	public Author add( Author entity) {
		return this.repo.save(entity);
	
}
	public Author update( Author entity) {
		return this.repo.save(entity);
	
}	
//	public Author remove(Author entity) {
//		Optional<Author> found=this.repo.findById(entity.getPhoneNumber());
//		if(found.isPresent()) {
//			this.repo.delete(entity);
//		}else {
//			throw  new NoSuchElementException("Element with that Id not available");
//		}
//				return entity;
//	
}
