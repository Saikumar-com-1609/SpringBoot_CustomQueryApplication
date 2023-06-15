package com.ait.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class Book {
	
	

	@Id
	private Integer bookid;
	
	private String bookname;
	
	private Double bookprice;

	}

	
	

