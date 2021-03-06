package mc.sn.semi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import mc.sn.semi.vo.MemberVO;



@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectOwnerList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectOwnerList");
		return membersList;
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert("mapper.member.insertMember", vo);
	}
	
	@Override
	public MemberVO selectForLogin(MemberVO vo) {
		return sqlSession.selectOne("mapper.member.selectForLogin", vo);
	}
	
	@Override
	public void updateCommitDay(Map commitMap) {
		sqlSession.update("mapper.member.updateCommitDay", commitMap);
	}
}
