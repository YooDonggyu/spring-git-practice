package org.kosta.practice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.kosta.practice.model.CustomerService;
import org.kosta.practice.model.CustomerVO;
import org.kosta.practice.model.ShareVO;
import org.kosta.practice.model.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	private CustomerService cs;
	
	@RequestMapping("home.do")
	public String home(HttpServletRequest request, Model model) {
		List<StockVO> slist = cs.getStockList();
		model.addAttribute("stockList", slist);

		if(request.getSession().getAttribute("customerVO") != null) {
			String id = ((CustomerVO)request.getSession().getAttribute("customerVO")).getId();
			List<ShareVO> hlist = cs.findShareListById(id);
			model.addAttribute("shareList", hlist);
		}
		return "home";
	}
	
	
	@RequestMapping("logout.do")
	public String home(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:home.do";
	}
}
