package com.ait.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ait.entity.Book;

public interface BookRepo extends CrudRepository<Book,Integer> {
	
	@Modifying
	@Query(value = "insert into book(bookid,bookname,bookprice) values (:id,:name,:price)",nativeQuery = true)
	@Transactional
	void insertBook(@Param("id") Integer id, @Param("name") String name, @Param("price") Double price);
	
	
	@Modifying
	@Query(value = "update Book set bookname = :name where bookid = :id", nativeQuery = true)
	@Transactional
	Integer updateBookName(@Param("name") String name, @Param("id") Integer id);
	
    @Modifying
    @Query(value = "delete from Book where bookid = :id", nativeQuery = true)
    @Transactional
    Integer deleteBookId(@Param("id") Integer id);

}
