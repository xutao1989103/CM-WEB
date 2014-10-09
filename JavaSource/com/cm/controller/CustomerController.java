package com.cm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cm.biz.CustomerBiz;
import com.cm.entity.Account;
import com.cm.entity.AccountMessage;
import com.cm.entity.AccountMessage.CustomerJson;
import com.cm.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Inject
	private CustomerBiz<Customer> biz;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody AccountMessage<Customer> getlogindata(HttpServletRequest request){
		AccountMessage<Customer> result=new AccountMessage<Customer>();
		String username=request.getParameter("name");
		String password=request.getParameter("pass");
		Map<String, String> map=new HashMap<String, String>();
		map.put("c_name",username);
		map.put("c_password",password);
		List<Customer> customers=biz.getListByNameAndPassword(map);
		if(customers!=null&&customers.size()>0){
			result.setCode(10000);
			result.setMessage("Login ok");
			Customer cus=customers.get(0);
			AccountMessage.CustomerJson cj=new AccountMessage().new CustomerJson();
			cj.setCustomer(customers.get(0));
			HttpSession session=request.getSession();
			session.setAttribute("customer",customers.get(0));
			result.setResult(cj);
			return result;
		}else{
			result.setCode(14001);
			result.setMessage("Login failed");
			result.setResult(null);
			return result;
		}
		
	}
	

}
