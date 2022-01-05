package mc.sn.semi.dao;

import java.util.List;

import mc.sn.semi.vo.BoardVO;

public interface BoardDAO {
	public List selectBoardById(String ownerId);
	
	public void insertBoardRequest(BoardVO vo);
	
	public BoardVO selectBoard(int articleNO);
}
