package org.zerock.web;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SmemVO;
import org.zerock.persistence.SmemDAO;

@Controller
@RequestMapping("/smem/*")

public class SmemController {
	@Autowired
	private SmemDAO dao;

	@GetMapping("/index")
	public void createAction(SmemVO vo, Model model) {
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(SmemVO vo, Model model) throws Exception {
		dao.create(vo);
		model.addAttribute("vo", vo); // setAttribute와 동일한 역할을 함
		
		model.addAttribute("list", dao.list());
		return "smem/list";
	}
	
	@GetMapping("/list")
	public void list(SmemVO vo, Model model) throws Exception {
		
	}

//	@GetMapping("/list/{bno}")
//	public void list(Model model, @PathVariable("bno") String bno) throws Exception {
//		
//		model.addAttribute("vo", dao.read(bno));
//	}

	@GetMapping("/doC")
	public @ResponseBody SmemVO doC() {
		SmemVO vo = new SmemVO();
		vo.setUserid("asdf");
		vo.setUserpw("asdf");
		return vo;
	}

	@GetMapping("/doD")
	public String doD() {
		System.out.println("doD called......");
		return "redirect:./doE";
	}

	@GetMapping("/doE")
	public void doE() {
		System.out.println("doE called!!!!!!");
	}

}
