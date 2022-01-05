package mc.sn.semi.service;

import java.util.List;

import mc.sn.semi.vo.BoardVO;

public interface BoardService {
	public List readBoard(String ownerId);
	
	public void addRequest(BoardVO vo);
	
	public BoardVO searchBoard(int articleNO);
}
