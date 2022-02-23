package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.product.vo.ProductVO;
import util.DBManager;

public class ProductDAO {
	private ProductDAO() {
		
	}
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	public List<ProductVO> selectAllProduct(){
		String sql = "SELECT * FROM PRODUCT ORDER BY PID";
		List<ProductVO> list = new ArrayList<ProductVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductVO pvo = new ProductVO();
				pvo.setPid(rs.getInt("pid"));
				pvo.setPname(rs.getString("pname"));
				pvo.setPrice(rs.getLong("price"));
				pvo.setRegdate(rs.getTimestamp("regdate"));
				
				list.add(pvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn,pstmt, rs);
		}
		return list;
	}
}
