package mc.sn.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.sn.semi.dao.BoardDAO;
import mc.sn.semi.vo.BoardVO;

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
	
	@Override
	public void addRequest(BoardVO vo) {
		boardDAO.insertBoardRequest(vo);
	}
	
	@Override
	public BoardVO searchBoard(int articleNO) {
		return boardDAO.selectBoard(articleNO);
	}
}
