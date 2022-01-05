package mc.sn.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.sn.semi.dao.BoardDAO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List readBoard(String ownerId) {
		List list = null;
		list = boardDAO.selectBoardById(ownerId);
		return list;
	}
}
