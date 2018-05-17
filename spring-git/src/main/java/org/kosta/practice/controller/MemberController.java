package org.kosta.practice.controller;

import javax.servlet.http.HttpServletRequest;

import org.kosta.practice.model.CustomerService;
import org.kosta.practice.model.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	private CustomerService service;
	//
	@RequestMapping("login.do")
	public String login(CustomerVO vo, HttpServletRequest request, Model model) {
		CustomerVO rvo = service.login(vo);
		if(rvo != null) {
			request.getSession().setAttribute("customerVO", rvo);
			System.out.println("라이야 히~ 라이야 호~");
			return "redirect:home.do";
		}else {
			System.out.println("라이야 히~ 라이야 오우호우~");
			return "login_fail";
		}
	}
}
