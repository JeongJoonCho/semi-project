package mc.sn.semi.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import mc.sn.semi.vo.MemberVO;

public interface MemberDAO {
	public List selectOwnerList() throws DataAccessException;
	
	public void insertMember(MemberVO vo);
}
