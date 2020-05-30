package com.garamm.study.board.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.garamm.study.board.dto.Board;

@Repository
public class BoardDao {

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public List<Board> list(Board vo) {
		SqlSession session = sqlSessionFactory.openSession();
		return session.selectList("board.list", vo);
	}
	
	public int insert(Board vo) {
		SqlSession session = sqlSessionFactory.openSession();
		return session.insert("board.insert", vo);
	}
	
	public int update(Board vo) {
		SqlSession session = sqlSessionFactory.openSession();
		return session.update("board.update", vo);
	}
	
	public int delete(int seq) {
		SqlSession session = sqlSessionFactory.openSession();
		// update를 하면 영향받은 열 개수가 다 나오기때문
		return session.update("board.delete", seq);
	}

}
