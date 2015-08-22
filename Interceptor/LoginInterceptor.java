package com.ujche.Interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ujche.common.CookieHelper;
import com.ujche.common.MD5Helper;
import com.ujche.common.ConfigHelper;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		try {
			Cookie cookieUId = CookieHelper.getCookieByName(request, "uid");
			Cookie cookieTokenId = CookieHelper.getCookieByName(request, "tokenid");
			if(cookieUId!=null && cookieTokenId!= null){
				String userId = cookieUId.getValue();
				String tokenId = cookieTokenId.getValue();
				MD5Helper md5Helper = new MD5Helper();
				if(md5Helper.getTokenId(userId).equals(tokenId)){
					return true;
				}
			}
			String adminIndex = ConfigHelper.getInstance("config").getValue("adminIndex");
			response.sendRedirect(request.getContextPath() + "/" + adminIndex);
			return false;
		} catch(Exception ex) {
			response.sendRedirect(request.getContextPath() + "/adminlogin.do");
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
