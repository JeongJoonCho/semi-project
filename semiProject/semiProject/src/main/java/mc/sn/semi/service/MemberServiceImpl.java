package mc.sn.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import mc.sn.semi.dao.MemberDAO;
import mc.sn.semi.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public List listOwners() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectOwnerList();
		return membersList;
	}
	
	@Override
	public void addMember(MemberVO vo) {
		memberDAO.insertMember(vo);
	}
}
