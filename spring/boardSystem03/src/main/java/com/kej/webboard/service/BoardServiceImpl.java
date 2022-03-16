package com.kej.webboard.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.webboard.domain.BoardVO;
import com.kej.webboard.domain.FileVO;
import com.kej.webboard.mapper.BoardMapper;


@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

//	<!--modify-->
	@Override
	public BoardVO read(int bno) {
		boardMapper.hitcount(bno);
		List<FileVO> fileList = boardMapper.getFileList(bno);
		BoardVO vo = boardMapper.read(bno);
		vo.setFileList(fileList);
		return vo;
	}

	@Override
	public void Insert(BoardVO board) {
		boardMapper.insertSelectKey(board);
		board.getFileList().forEach(fileVO ->{
			fileVO.setBno(board.getBno());
			boardMapper.fileRegister(fileVO);
		});
		
	}

	@Override
	public boolean update(BoardVO vo) {
		return boardMapper.update(vo)==1;
		
	}

	@Override
	public boolean delete(int bno) {
		boardMapper.delete(bno);
		return boardMapper.delete(bno)==1;
	}

//	@Override
//	public int boardCount() {
//		return boardMapper.boardCount();
//	}

	@Override
	public List<BoardVO> findPage(HashMap<String,Object> hm) {
		return boardMapper.findPage(hm);
	}

	@Override
	public List<BoardVO> findAll(HashMap<String, Object> hm) {
		return boardMapper.findAll(hm);
	}

	@Override
	public int boardCount(HashMap<String, Object> hm) {
		return boardMapper.boardCount(hm);
	}
	
	@Override
	public FileVO getFile(int fno) {
		return boardMapper.getFile(fno);
	}

	
}
