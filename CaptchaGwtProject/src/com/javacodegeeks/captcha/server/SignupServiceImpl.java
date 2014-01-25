package com.javacodegeeks.captcha.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import nl.captcha.Captcha;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.javacodegeeks.captcha.client.SignupService;

@SuppressWarnings("serial")
public class SignupServiceImpl extends RemoteServiceServlet implements SignupService {

	public boolean performSignup(String username, String password, String userCaptcha) {
		
		HttpServletRequest request = getThreadLocalRequest();
		
		HttpSession session = request.getSession();

		Captcha captcha = (Captcha) session.getAttribute(Captcha.NAME);
		
		return captcha.isCorrect(userCaptcha);
		
	}
}
