package mc.sn.semi.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface MemberDAO {
	public List selectOwnerList() throws DataAccessException;
}
