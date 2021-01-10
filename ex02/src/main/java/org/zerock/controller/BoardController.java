package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	private final BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list..............");
		model.addAttribute("list", service.getList());
		
	}
	
	@PostMapping("/register")
	public String register(BoardVO board,RedirectAttributes rttr) {
		log.info("register: "+ board);
		Integer bno =service.register(board);
		log.info("BNO: "+bno);
		rttr.addFlashAttribute("result", bno); //실제론 session에 들어가고 한번 쓰면 지워짐 
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board,RedirectAttributes rttr) {
		int count =service.modify(board);
		if(count == 1 ) {
			rttr.addFlashAttribute("result", "success"); 
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(int bno,RedirectAttributes rttr) {
		int count =service.remove(bno);
		if(count == 1 ) {
			rttr.addFlashAttribute("result", "success"); 
		}
		return "redirect:/board/list";
	}
	
}
