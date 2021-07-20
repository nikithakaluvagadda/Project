package com.example.demo.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
@Component
//@Lazy
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MobilePlan {
	int id;
	String planName;
	double value;
	long validity;
	public MobilePlan() {
		super();
		System.out.println("mobile phone constructor called");
	}
	
}
