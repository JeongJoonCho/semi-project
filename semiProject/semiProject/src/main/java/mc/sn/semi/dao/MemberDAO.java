package mc.sn.semi.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import mc.sn.semi.vo.MemberVO;

public interface MemberDAO {
	public List selectOwnerList() throws DataAccessException;
	
	public void insertMember(MemberVO vo);
	
	public MemberVO selectForLogin(MemberVO vo);
	
	public void updateCommitDay(Map commitMap);
}
