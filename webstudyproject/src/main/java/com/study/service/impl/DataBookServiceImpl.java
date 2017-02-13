package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.DataBookDao;
import com.study.domain.Book;
import com.study.service.DataBookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataBookServiceImpl implements DataBookService {

	@Autowired
	private DataBookDao dataBookDao;
	
	@Override
	public boolean checkAllBook() {
		List<Book> selectAllBook = dataBookDao.selectAllBook();
		for (Book book : selectAllBook) {
			log.info(book.toString());
		}
		return true;
	}

}
