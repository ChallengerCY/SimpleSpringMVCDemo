package servlet;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {

	public ModelAndView dologin(String logingPath, String successPage, String name, String password) {
		if(name==null||"".equals(name))
		{
			return new ModelAndView(logingPath,"error","用户名不能为空");
		}
		if(password==null||"".equals(password))
		{
			return new ModelAndView(logingPath,"error","密码不能为空");
		}
		
		if(name.equals("admin")&&password.equals("123"))
		{
			return new ModelAndView(successPage);
		}
		
		return new ModelAndView(logingPath,"error","用户名或密码错误");
	}

}
