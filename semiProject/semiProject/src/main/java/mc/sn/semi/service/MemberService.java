package mc.sn.semi.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface MemberService {
	public List listOwners() throws DataAccessException;
}
