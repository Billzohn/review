package cn.springmvc.tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AllInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session=request.getSession();

		if(session.getAttribute("switch")==null || (Integer)session.getAttribute("switch")!=1){
			System.out.println("===拦截下来！！！！==="+session.getAttribute("switch"));
			request.getRequestDispatcher("../ljqindex.htm").forward(request,response);
			return false;
		}
		return true;
	}
}
