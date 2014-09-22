package com.cm.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cm.biz.AccountBiz;
import com.cm.entity.Account;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Inject
	private AccountBiz<Account> biz;
	
	@RequestMapping("/add")
	public String add(Account acc) {
		System.out.println(acc);
		biz.addAccount(acc);
		return "redirect:/account/list.do";
	}
	
	@RequestMapping("/get")
	public String get(Integer id, Model model) {
		System.out.println("##ID:" + id);
		model.addAttribute(biz.getAccount(id));
		return "/show.jsp";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", biz.getList());
		return "/List.jsp";
	}
	
	@ExceptionHandler(Exception.class)
	public String exception(Exception e, HttpServletRequest request) {
		//e.printStackTrace();
		request.setAttribute("exception", e);
		return "/error.jsp";
	}
	
    @RequestMapping("/freemarker")
    public String sayHello(ModelMap map) {
    	map.addAttribute("list", biz.getList());
        return "/list.ftl";

    }

}
