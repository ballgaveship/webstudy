package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.service.DataBookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

	@Autowired
	private DataBookService dataBookService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public boolean home() {
		log.info("CheckAllBook");
		return dataBookService.checkAllBook();

	}

}
