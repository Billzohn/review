package cn.springmvc.tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session=request.getSession();
//		System.out.println("===user拦截下来！！！！===");
		if(session.getAttribute("userName")==null){
			request.getRequestDispatcher("../userhomepage.htm").forward(request,response);
			session.setAttribute("userId",-2);
			return false;
		}
		return true;
	}
}
