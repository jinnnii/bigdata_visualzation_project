package com.kej.security_board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kej.security_board.model.Board;
import com.kej.security_board.model.Reply;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
