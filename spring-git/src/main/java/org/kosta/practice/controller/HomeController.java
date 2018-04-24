package org.kosta.practice.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home.do")
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	
	@RequestMapping("logout.do")
	public String home(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:home.do";
	}
}
