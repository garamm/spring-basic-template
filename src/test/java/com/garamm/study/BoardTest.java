package com.garamm.study;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.garamm.study.board.dto.Board;
import com.garamm.study.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/db-context.xml",
									"file:src/main/webapp/WEB-INF/spring/board-context.xml"})
public class BoardTest {
	
	@Autowired
	BoardService service;
	
	Board vo;
	
	@Before
	public void init() {
		vo = new Board();
		vo.setSeq(1);
		vo.setTitle("ㅈㅁ");
		vo.setContents("ㄴㅇ");
		vo.setInsertDate(getNow());
	}
	
	public String getNow() {
		Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(d);
	}
	
	@Test
	public void list() {
		service.list(vo);
	}
	
	@Test
	public void searchList() {
		vo.setType("title");
		vo.setSearchStr("ㅈ");
		vo.setStartDate("20200530");
		vo.setEndDate("20200531");
		service.list(vo);
	}
	
//	@Test
	public void insert() {
		service.insert(vo);
	}
	
//	@Test
	public void update() {
		vo.setUpdateDate(getNow());
		vo.setTitle("ㅈㅁ2");
		service.update(vo);
	}
	
//	@Test
	public void delete() {
		service.delete(2);
	}
	
	
}
