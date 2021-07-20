package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerService;
import com.example.demo.model.INvoiceWithServiceDI;
import com.example.demo.model.Invoice;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx  =SpringApplication.run(SpringQuickstartApplication.class, args);
		/*Product product1 =ctx.getBean("tv",Product.class);
		System.out.println(product1);
		Product product2 =ctx.getBean("fridge",Product.class);
		System.out.println(product2);*/
		//Invoice inv=ctx.getBean(Invoice.class);
		//System.out.println(inv);
		
		//INvoiceWithServiceDI inv=ctx.getBean(INvoiceWithServiceDI.class);
		//System.out.println(inv);
		CustomerService service=ctx.getBean(CustomerService.class);
		service.getCustList().forEach(System.out::println);
		ctx.close();
		
	}
	@Bean
	@Primary
	public Product tv() {
		return new Product(101,"tv",34000);
	}
	@Bean
	public Product fridge() {
		return new Product(102,"fridge",24000);
	}
	@Bean
	public Customer ram() {
		return new Customer(201,"fani",945154000);
	}
	@Bean
	public Customer suresh() {
		return new Customer(202,"suresh",94554000);
	}
	@Bean
	public Customer mahesh() {
		return new Customer(203,"mahesh",94000);
	}
}