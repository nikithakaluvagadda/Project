package com.example.demo.services;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;



@Service
public class StudentService {

	Map<Integer, Student> studentlist;

	public StudentService() {
		super();

		studentlist = new HashMap<>();
		init();
	}

	public void init() {
		studentlist.put(1, new Student(101, "Nikitha"));

		studentlist.put(2, new Student(201, "Gopi"));

		studentlist.put(3, new Student(301, "Rohith"));

		
	}

	public Student getById(int id) {
		return this.studentlist.get(id);
	}

}