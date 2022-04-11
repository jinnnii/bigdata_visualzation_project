package com.kej.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.demo1.domain.BoardVO;
import com.kej.demo1.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public void register(BoardVO vo) {
		mapper.insert(vo);
		vo.getFileList().forEach(file->{
			file.setBno(vo.getBno());
			mapper.fileRegister(file);
		});
		
	}

	@Override
	public BoardVO read(int bno) {
		return mapper.read(bno);
	}

	@Override
	public boolean update(BoardVO vo) {
		return mapper.update(vo)==1;
	}

	@Override
	public boolean delete(int bno) {
		return mapper.delete(bno)==1;		
	}

}
