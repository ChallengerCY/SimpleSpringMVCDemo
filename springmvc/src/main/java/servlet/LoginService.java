package servlet;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {

	public ModelAndView dologin(String logingPath, String successPage, String name, String password) {
		if(name==null||"".equals(name))
		{
			return new ModelAndView(logingPath,"error","�û�������Ϊ��");
		}
		if(password==null||"".equals(password))
		{
			return new ModelAndView(logingPath,"error","���벻��Ϊ��");
		}
		
		if(name.equals("admin")&&password.equals("123"))
		{
			return new ModelAndView(successPage);
		}
		
		return new ModelAndView(logingPath,"error","�û������������");
	}

}
