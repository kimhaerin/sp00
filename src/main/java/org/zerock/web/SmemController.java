package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SmemVO;

@Controller
@RequestMapping("/smem/*")

public class SmemController {

	@GetMapping("/doA")
	// @RequestMapping(value = "/doA", method=RequestMethod.GET)
	public void doA(SmemVO vo, Model model) {
		System.out.println("=======================");
		System.out.println(vo);
		System.out.println("=======================");
		model.addAttribute("vo", vo); // setAttribute와 동일한 역할을 함

	}

	@PostMapping("/doAA")
	//@RequestMapping(value = "/doAA", method = RequestMethod.POST)
	public void doAA(SmemVO vo, Model model) {
		System.out.println("-----------------------");
		System.out.println(vo);
		System.out.println("-----------------------");
		model.addAttribute("vo", vo); // setAttribute와 동일한 역할을 함

	}

	@GetMapping("/doB/{bno}")
	public String doB(@PathVariable("bno") int bno) {
		System.out.println("=======================");
		System.out.println(bno);
		System.out.println("=======================");

		return "view";
	}

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
