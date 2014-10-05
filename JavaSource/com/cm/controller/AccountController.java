package com.cm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cm.biz.AccountBiz;
import com.cm.entity.Account;
import com.cm.entity.AccountModel;
import com.cm.entity.ResultMessage;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Inject
	private AccountBiz<Account> biz;
	
	@RequestMapping("/login")
	public ModelAndView accountLogin(Model model) {
		ModelAndView modelAndView=new ModelAndView("/login.ftl");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/accountLogin",method=RequestMethod.GET)
	
	public @ResponseBody ResultMessage accountLogin(HttpServletRequest request,AccountModel accountModel){
		ResultMessage result=new ResultMessage();
		HttpSession session=request.getSession();
		Map<String, String> map=new HashMap<String, String>();
		map.put("h_name",accountModel.getUsername());
		map.put("h_password",accountModel.getPassword());
		List<Account> accounts=biz.getListByNameAndPassword(map);
		if(accounts!=null&&accounts.size()>0){
			session.setAttribute("loginedUser", accounts.get(0));
			result.setCode(ResultMessage.SUCCESS);
			result.setMessage("login success");
		}else{
			result.setCode(ResultMessage.NOTSUCCESS);
			result.setMessage("can not find!");
		}
		return result;
	}
	
	@RequestMapping("/index")
	public ModelAndView getIndex(HttpServletRequest request){
		ModelAndView modelAndView=new ModelAndView("/index.ftl");
		HttpSession session=request.getSession();
		Account account=(Account)session.getAttribute("loginedUser");
		modelAndView.addObject("acc",account);
		return modelAndView;
	}
	
	
	@RequestMapping("/add")
	public ModelAndView add(Model model) {
		ModelAndView modelAndView=new ModelAndView("/add.ftl");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/addAccount",method=RequestMethod.POST)
	public ResultMessage addAccount(AccountModel accountModel){
		ResultMessage result=new ResultMessage();
		Account account=new Account();
		account.setUsername(accountModel.getUsername());
		account.setPassword(accountModel.getPassword());
		account.setStatus(1);
		boolean success=biz.addAccount(account);
		if(success){
			result.setCode(ResultMessage.SUCCESS);
			result.setMessage("save success");
		}else{
			result.setCode(ResultMessage.NOTSUCCESS);
		}
		return result;
	}
	
	@RequestMapping(value="/detail/{userId}",method=RequestMethod.GET)
	public ModelAndView getUserDetail(Model model,@PathVariable("userId") Integer userId){
		
		ModelAndView modelAndView=new ModelAndView("/detail.ftl");
		modelAndView.addObject("userInfo", biz.getAccount(userId));
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{userId}",method=RequestMethod.GET)
	public String deleteUser(ModelMap map,@PathVariable("userId") Integer userId){
		biz.deleteAccount(userId);
        return "redirect:/account/list.ftl";
	}
	
	@ExceptionHandler(Exception.class)
	public String exception(Exception e, HttpServletRequest request) {
		//e.printStackTrace();
		request.setAttribute("exception", e);
		return "/pages/error.jsp";
	}
	
    @RequestMapping("/list")
    public String sayHello(HttpServletRequest request ,ModelMap map) {
    	map.addAttribute("list", biz.getList());
        return "/list.ftl";

    }

}
