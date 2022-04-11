package com.kej.demo1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kej.demo1.domain.BoardVO;
import com.kej.demo1.domain.FileVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	public void insert(BoardVO board);
	public BoardVO read(int bno);
	public int update(BoardVO board);
	public int delete(int bno);
	
	public List<FileVO> getFileList(int bno);
	public void fileRegister(FileVO file);
	public FileVO getFile(int fno);
}
