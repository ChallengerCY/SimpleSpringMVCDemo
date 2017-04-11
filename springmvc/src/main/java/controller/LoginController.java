package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import servlet.LoginService;

@Controller
public class LoginController {
	
	@Resource
	LoginService loginservice;
	
	@Resource
	HttpServletRequest httpservletrequest;
	
	
	@RequestMapping("/login.do")
	public ModelAndView tologin()
	{
		String logingPath="login.jsp";
		String successPage="success.jsp";
		
		String name=httpservletrequest.getParameter("username");
		String password=httpservletrequest.getParameter("password");
		
		return loginservice.dologin(logingPath,successPage,name,password); 
	}

}
