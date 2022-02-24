package com.member.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.member.vo.MemberVO;

import util.DBManager;

public class MemberDAO {
	private MemberDAO() {
	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}
	
	public List<MemberVO> selectAllMember(){
		String sql = "SELECT * FROM JOIN_MEMBER";
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO mvo = new MemberVO();
				mvo.setId(rs.getString("id"));
				mvo.setPasswd(rs.getString("passwd"));
				mvo.setName(rs.getString("name"));
				mvo.setAddr(rs.getString("address"));
				mvo.setEmail(rs.getString("email"));
				mvo.setRegdate(rs.getTimestamp("regdate"));
				
				list.add(mvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn,pstmt, rs);
		}
		return list;
	}
	
	public void insertMember(MemberVO mvo) {
		String sql="INSERT INTO JOIN_MEMBER VALUES(?,?,?,?,?,SYSDATE)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mvo.getId());
			pstmt.setString(2, mvo.getPasswd());
			pstmt.setString(3, mvo.getName());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setString(5, mvo.getAddr());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn,pstmt);
		}

	}
	
	public MemberVO selectOneMember(String id) {
		String sql="SELECT * FROM JOIN_MEMBER WHERE ID=?";
		MemberVO mvo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mvo = new MemberVO();
				mvo.setId(rs.getString("id"));
				mvo.setPasswd(rs.getString("passwd"));
				mvo.setName(rs.getString("name"));
				mvo.setEmail(rs.getString("email"));
				mvo.setAddr(rs.getString("address"));
				mvo.setRegdate(rs.getTimestamp("regdate"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return mvo;
	}
	
	public void updateMember(MemberVO mvo) {
		String sql ="UPDATE JOIN_MEMBER SET PASSWD=?, NAME=?, EMAIL=?, ADDRESS=? WHERE ID=?";
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mvo.getPasswd());
			pstmt.setString(2, mvo.getName());
			pstmt.setString(3, mvo.getEmail());
			pstmt.setString(4, mvo.getAddr());
			pstmt.setString(5, mvo.getId());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void deleteMember(String id) {
		String sql="DELETE FROM JOIN_MEMBER WHERE ID=?";
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}

}
