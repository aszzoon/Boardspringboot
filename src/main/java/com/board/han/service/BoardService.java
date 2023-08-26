package com.board.han.service;

import com.board.han.entity.Board;
import com.board.han.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
		@Autowired
		private BoardRepository boardRepository;
		public void write(Board board) {

				boardRepository.save(board);
		}

		public List<Board> boardlist() {

				return boardRepository.findAll();
		}

}
