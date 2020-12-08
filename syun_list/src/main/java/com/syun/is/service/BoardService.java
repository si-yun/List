package com.syun.is.service;

import java.util.List;

import com.syun.is.vo.BoardVO;

public interface BoardService {
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;

	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception;
}