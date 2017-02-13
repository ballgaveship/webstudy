package com.test.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.dao.DataBookDao;
import com.study.domain.Book;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration(value={
		"classpath:test-context.xml"
	})
public class DataBookDaoTest {

	@Autowired
	private DataBookDao dataBookDao;
	
	@Test
	public void selectAllBookTest() throws Exception {
		List<Book> selectAllBook = dataBookDao.selectAllBook();
		for (Book book : selectAllBook) {
			log.info(book.toString());
		}
		assertNotNull(selectAllBook);
	}
}
