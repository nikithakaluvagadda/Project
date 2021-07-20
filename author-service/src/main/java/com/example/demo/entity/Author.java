package com.example.demo.entity;



import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
@Table(name="author")
public class Author {
	@Id
	private long phoneNumber;
	private String firstName;
	private String lastName;
	private String address;

}
