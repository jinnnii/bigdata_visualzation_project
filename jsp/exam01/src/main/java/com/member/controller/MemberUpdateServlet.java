package com.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.dao.MemberDAO;
import com.member.vo.MemberVO;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/memberUpdate")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO mdao = MemberDAO.getInstance();
		MemberVO mvo = mdao.selectOneMember(id);
		
		request.setAttribute("member", mvo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/memberUpdate.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("utf-8");
		
		String id =request.getParameter("id");
		String passwd =request.getParameter("passwd");
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		String addr =request.getParameter("addr");
		
		MemberVO mvo = new MemberVO();
		mvo.setId(id);
		mvo.setPasswd(passwd);
		mvo.setName(name);
		mvo.setEmail(email);
		mvo.setAddr(addr);
		
		MemberDAO mdao = MemberDAO.getInstance();
		mdao.updateMember(mvo);
		
		response.sendRedirect("memberList");
	}

}
