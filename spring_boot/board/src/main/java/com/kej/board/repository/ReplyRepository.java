package com.kej.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.kej.board.model.Board;
import com.kej.board.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{
	public List<Reply> findByBoard(Board board);
	
	//@ManyToOne(fetch=FetchType.LAZY)
	@Query("select r from Reply r join fetch r.board where board_id=?1")
	public List<Reply> findByBno(Long bno);
	
//	@Modifying
//	@Query(value="insert into reply(writer, content, board_id, regdate, user_id) values(?1,?2,now(),?3,?4)", nativeQuery=true)
//	public void replyInsert(String writer, String content, Long board_id, Long user_id);
}
