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
	
	public void insertProduct(ProductVO pvo) {
		String sql="INSERT INTO PRODUCT VALUES(?,?,?,SYSDATE)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, pvo.getPid());
			pstmt.setString(2, pvo.getPname());
			pstmt.setLong(3, pvo.getPrice());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn,pstmt);
		}
	}
	
	public ProductVO selectOneProduct(int pid) {
		String sql="SELECT * FROM PRODUCT WHERE PID=?";
		ProductVO pvo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pvo = new ProductVO();
				pvo.setPid(rs.getInt(rs.getInt("pid")));
				pvo.setPname(rs.getString("pname"));
				pvo.setPrice(rs.getLong("price"));
				pvo.setRegdate(rs.getTimestamp("regdate"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return pvo;
	}
	
	public void updateProduct(ProductVO pvo) {
		String sql ="UPDATE PRODUCT SET PNAME=?, PRICE=? WHERE PID=?";
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pvo.getPname());
			pstmt.setLong(2, pvo.getPrice());
			pstmt.setInt(3, pvo.getPid());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void deleteProduct(int pno) {
		String sql="DELETE FROM PRODUCT WHERE PID=?";
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, pno);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
}
