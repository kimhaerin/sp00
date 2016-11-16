package org.zerock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public void index(SmemVO vo, Model model) {
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(SmemVO vo, Model model) throws Exception {
		dao.create(vo);
		model.addAttribute("vo", vo); // setAttribute와 동일한 역할을 함

	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public void list(SmemVO vo, Model model) throws Exception {

		model.addAttribute("list", dao.list());

	}

	@GetMapping("/read/{userid}")
	public String read(@PathVariable("userid") String userid, Model model) throws Exception {
		model.addAttribute("vo", dao.read(userid));
		return "smem/read";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(SmemVO vo, Model model) throws Exception {
		dao.delete(vo.getUserid());
		return "smem/result";
	}

	@RequestMapping(value = "/updateAction", method = RequestMethod.POST)
	public String updateAction(SmemVO vo, Model model) throws Exception {
		model.addAttribute("vo", vo);
		System.out.println(vo);
		
		return "smem/updateAction";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(SmemVO vo, Model model) throws Exception {
		dao.update(vo);
		return "smem/result";
	}

	// @GetMapping("/doC")
	// public @ResponseBody SmemVO doC() {
	// SmemVO vo = new SmemVO();
	// vo.setUserid("asdf");
	// vo.setUserpw("asdf");
	// return vo;
	// }
	//
	// @GetMapping("/doD")
	// public String doD() {
	// System.out.println("doD called......");
	// return "redirect:./doE";
	// }
	//
	// @GetMapping("/doE")
	// public void doE() {
	// System.out.println("doE called!!!!!!");
	// }

}
