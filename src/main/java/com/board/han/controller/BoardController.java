package com.board.han.controller;

import com.board.han.entity.Board;
import com.board.han.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
		@Autowired
		private BoardService boardService;

		@GetMapping("board/write")
		//@ResponseBody
		public String boardWriteForm() {

				return "boardwrite";
		}

		@PostMapping("/board/writepro")
		public String boardWritePro(Board board) {
				boardService.write(board);
//				System.out.println(board.getTitle());

				return "";
		}

		@GetMapping("/board/list")
		public String boardList(Model model){

				model.addAttribute("list", boardService.boardlist());

				return "boardList";
		}
}
