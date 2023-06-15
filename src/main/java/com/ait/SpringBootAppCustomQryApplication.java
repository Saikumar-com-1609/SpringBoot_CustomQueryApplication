package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.ait.dao.BookRepo;
import com.ait.entity.Book;

@SpringBootApplication
public class SpringBootAppCustomQryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootAppCustomQryApplication.class, args);
		
		BookRepo bean = ctxt.getBean(BookRepo.class);
		/*
		bean.insertBook(123, "spring", 799.00);

		System.out.println("Successfully Data Is Inserted");
			*/
		/*
		  Integer updateBookName = bean.updateBookName("Devops", 122);
		System.out.println(updateBookName);
		
		System.out.println("Updated Succeccfully");
		*/
		
		/*
		Integer deleteBookId = bean.deleteBookId(122);
		System.out.println("Row Deleted :" +deleteBookId);
		
		System.out.println("Deleted Successfully");
		
		*/
		
		}

	}


		
	


