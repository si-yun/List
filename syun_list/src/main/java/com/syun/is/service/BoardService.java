package com.syun.is.service;

import com.syun.is.vo.BoardVO;

public interface BoardService {
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}