package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Author;
import com.example.demo.services.AuthorService;



@RestController
public class AuthorController {
	@Autowired
	private AuthorService service;
	@GetMapping(path="/authors")
	public List<Author> getAll(){
		return this.service.getAll();
	}
	@PostMapping(path="/authors")
	public ResponseEntity<Author> add(@RequestBody Author entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body( this.service.add(entity));
	}
	@PutMapping(path="/payments")
	public Author update(@RequestBody Author entity) {
		return this.service.add(entity);
	}




}
