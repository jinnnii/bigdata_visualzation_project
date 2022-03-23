package com.kej.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kej.board.model.Board;
import com.kej.board.model.Reply;

public interface BoardRepository extends JpaRepository<Board, Long>{
}
