package com.garamm.study.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garamm.study.board.dao.BoardDao;
import com.garamm.study.board.dto.Board;

@Service
public class BoardService {
	
	@Autowired
	BoardDao dao;
	
	public List<Board> list(Board vo) {
		return dao.list(vo);
	}
	
	public int insert(Board vo) {
		return dao.insert(vo);
	}
	
	public int update(Board vo) {
		return dao.update(vo);
	}
	
	public int delete(int seq) {
		return dao.delete(seq);
	}

}
