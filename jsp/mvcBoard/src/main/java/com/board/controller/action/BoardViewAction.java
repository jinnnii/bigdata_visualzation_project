package com.board.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.dao.BoardDAO;
import com.board.dto.BoardVO;

public class BoardViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/board/boardView.jsp";
		String num = request.getParameter("num");
		
		BoardDAO bdao = BoardDAO.getInstance();
		
		//조회수 증가
		bdao.updateReadCount(num);
		
		BoardVO bvo = bdao.selectOneBoardByNum(num);
		
		request.setAttribute("board", bvo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
