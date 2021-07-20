package com.training.services;
import java.util.*;
import com.training.entity.Book;
public class BookService {
	Map<String,List<Book>> bookList;

	public BookService() {
		super();
		bookList=new HashMap<>();
		init();
		
	}
	public void init() {
		List<Book> java=new ArrayList<>();
		java.add(new Book(101,"head first java"));
		java.add(new Book(102,"spring in action"));
	
		List<Book> novel=new ArrayList<>();
		novel.add(new Book(201,"Harrypotter"));
		novel.add(new Book(102,"war in brazil"));
		bookList.put("java",java);
		bookList.put("novel", novel);
		
	}
	public List<Book> searchBook(String key){
		return this.bookList.get(key);
	}
}
