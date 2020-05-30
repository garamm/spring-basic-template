package com.garamm.study.board.controller;

import java.util.Locale;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@RequestMapping(value="/")
	public String home(Locale locale, Model model) {
		SqlSession session = sqlSessionFactory.openSession();
		System.out.println(String.valueOf(session.selectOne("time.getTime")));
		return "home";
	}
	
	
}
