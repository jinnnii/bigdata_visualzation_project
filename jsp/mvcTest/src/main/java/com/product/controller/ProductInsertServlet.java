package com.product.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.dao.ProductDAO;

import conn.product.vo.ProductVO;

/**
 * Servlet implementation class ProductInsertServlet
 */
@WebServlet("/productInsert")
public class ProductInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		long price = Long.parseLong(request.getParameter("price"));
		
		ProductVO pvo = new ProductVO();
		pvo.setPid(pid);
		pvo.setPname(pname);
		pvo.setPrice(price);
		
		ProductDAO pdao = ProductDAO.getInstance();
		pdao.insertProduct(pvo);
		
		response.sendRedirect("productList");
	}

}
