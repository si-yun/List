package com.syun.is.dao;

import com.syun.is.vo.BoardVO;

public interface BoardDAO {
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}