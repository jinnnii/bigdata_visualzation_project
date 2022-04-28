package com.kej.bitc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kej.bitc.dto.BoardDto;

@Mapper
public interface BoardMapper {
	public List<BoardDto> selectBoardList();
	public BoardDto selectBoard(int BoardId);
	public void insertBoard(String title, String content, String createId, String updateId);
	public void updateBoard(String title, String content, int BoardId);
	public void deleteBoard(int BoardId);
	
}
