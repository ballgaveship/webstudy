package com.study.dao;

import java.util.List;

import com.study.domain.Book;

public interface DataBookDao {
	 
    public List<Book> selectAllBook();
    public String selectBookName(String id);
 
}