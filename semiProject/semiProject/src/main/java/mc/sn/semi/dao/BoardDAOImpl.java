package mc.sn.semi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.semi.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectBoardById(String ownerId) {
		List list = null;
		list = sqlSession.selectList("mapper.board.selectBoardById", ownerId);
		return list;
	}
	
	@Override
	public void insertBoardRequest(BoardVO vo) {
		sqlSession.insert("mapper.board.insertBoardRequest", vo);
	}
	
	@Override
	public BoardVO selectBoard(int articleNO) {
		return sqlSession.selectOne("mapper.board.selectBoard", articleNO);
	}
}
