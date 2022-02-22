package com.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.board.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	// DAO : data Access Object
	//
	// 싱글톤 패턴
	private BoardDAO() {
		
	}

	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	public List<BoardVO> selectAllBoards() {
		String sql = "SELECT * FROM BOARD ORDER BY NUM DESC";
		List<BoardVO> list = new ArrayList<BoardVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BoardVO bvo = new BoardVO();
				bvo.setNum(rs.getInt("num"));
				bvo.setName(rs.getString("name"));
				bvo.setEmail(rs.getString("email"));
				bvo.setPass(rs.getString("pass"));
				bvo.setTitle(rs.getString("title"));
				bvo.setContent(rs.getString("content"));
				bvo.setReadCount(rs.getInt("readcount"));
				bvo.setWhitedate(rs.getTimestamp("writedate"));

				list.add(bvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}

		return list;
	}

	public void insertBoard(BoardVO bvo) {
		String sql = "INSERT INTO BOARD(NUM, NAME, EMAIL, PASS, TITLE, CONTENT)"
				+ "VALUES(BOARD_SEQ.NEXTVAL, ?,?,?,?,?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bvo.getName());
			pstmt.setString(2, bvo.getEmail());
			pstmt.setString(3, bvo.getPass());
			pstmt.setString(4, bvo.getTitle());
			pstmt.setString(5, bvo.getContent());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// 조회수증가 : 업데이트
	public void updateReadCount(String num) {
		String sql = "UPDATE BOARD SET READCOUNT = READCOUNT+1 WHERE NUM=?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// 게시글 상세 내용 보기
	public BoardVO selectOneBoardByNum(String num) {
		String sql = "SELECT * FROM BOARD WHERE NUM=?";

		BoardVO bvo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				bvo = new BoardVO();
				bvo.setNum(rs.getInt("num"));
				bvo.setName(rs.getString("name"));
				bvo.setEmail(rs.getString("email"));
				bvo.setTitle(rs.getString("title"));
				bvo.setContent(rs.getString("content"));
				bvo.setReadCount(rs.getInt("readcount"));
				bvo.setWhitedate(rs.getTimestamp("writedate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}

		return bvo;
	}

	public void updateBoard(BoardVO bvo) {
		String sql = "UPDATE BOARD SET NAME=?, EMAIL=?, PASS=?, TITLE=?, CONTENT=?, WHERE NUM=?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bvo.getName());
			pstmt.setString(2, bvo.getEmail());
			pstmt.setString(3, bvo.getPass());
			pstmt.setString(4, bvo.getTitle());
			pstmt.setString(5, bvo.getContent());
			pstmt.setInt(6, bvo.getNum());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// 패스워드 확인
	public BoardVO chceckPassWord(String pass, String num) {
		String sql = "SELECT * FROM BOARD WHERE PASS=? AND NUM=?";

		BoardVO bvo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pass);
			pstmt.setString(2, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				bvo = new BoardVO();
				bvo.setNum(rs.getInt("num"));
				bvo.setName(rs.getString("name"));
				bvo.setEmail(rs.getString("email"));
				bvo.setTitle(rs.getString("title"));
				bvo.setContent(rs.getString("content"));
				bvo.setReadCount(rs.getInt("readcount"));
				bvo.setWhitedate(rs.getTimestamp("writedate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}

		return bvo;
	}
	//게시글 삭제
	public void deleteBoard(String num) {
		String sql="DELETE FROM BOARD WHERE NUM=?";
		
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			conn=DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
}
