package com.board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.dto.BoardVO;

public class BoardWriteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardVO bvo = new BoardVO();
		
		bvo.setName(request.getParameter("name"));
		bvo.setEmail(request.getParameter("email"));
		bvo.setPass(request.getParameter("pass"));
		bvo.setTitle(request.getParameter("title"));
		bvo.setContent(request.getParameter("content"));
		
		BoardDAO bdao = BoardDAO.getInstance();
		bdao.insertBoard(bvo);
		
		new BoardListAction().execute(request, response);
	}

}
