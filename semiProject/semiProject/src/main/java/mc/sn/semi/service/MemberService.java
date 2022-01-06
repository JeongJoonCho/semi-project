package mc.sn.semi.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import mc.sn.semi.vo.MemberVO;

public interface MemberService {
	public List listOwners() throws DataAccessException;

	public void addMember(MemberVO vo);
	
	public MemberVO login(MemberVO vo);
	
	public void finishCommit(Map commitMap);
}
