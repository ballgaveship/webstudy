package com.study.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.dao.DataBookDao;
import com.study.domain.Book;

@Repository
public class DataBookDaoImpl implements DataBookDao{

	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Book> selectAllBook() {
		List<Book> users = sqlSession.selectList("getBookInfo");
		return users;
	}

	@Override
	public String selectBookName(String id) {
		String name = sqlSession.selectOne("getBookName", id);
		return name;
	}

}

