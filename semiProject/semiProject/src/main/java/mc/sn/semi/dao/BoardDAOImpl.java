package mc.sn.semi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
