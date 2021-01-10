package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {

	Integer register(BoardVO board);
	
	public BoardVO get(Integer bno);
	
	int modify(BoardVO board);
	
	int remove(Integer bno);
	
	List<BoardVO> getList();
	
}
