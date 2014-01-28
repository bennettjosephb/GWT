package au.com.showcase.application.server;

import static nl.captcha.Captcha.NAME;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import nl.captcha.Captcha;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;

import au.com.showcase.application.client.account.NewRegistration;
import au.com.showcase.application.client.account.NewRegistrationResult;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class NewRegistrationActionHandler implements
		ActionHandler<NewRegistration, NewRegistrationResult> {

	private Provider<HttpServletRequest> requestProvider;

	private ServletContext servletContext;

	private HttpServletRequest httpServletRequest;

	private HttpSession httpSession = null;

	@Inject
	public NewRegistrationActionHandler(
			Provider<HttpServletRequest> requestProvider,
			ServletContext servletContext, HttpServletRequest httpServletRequest) {
		super();
		this.requestProvider = requestProvider;
		this.servletContext = servletContext;
		this.httpServletRequest = httpServletRequest;
		httpSession = httpServletRequest.getSession();
	}

	@Override
	public NewRegistrationResult execute(NewRegistration action,
			ExecutionContext context) throws ActionException {

		Captcha captcha = (Captcha) httpSession.getAttribute(NAME);

		return null;
	}

	@Override
	public void undo(NewRegistration action, NewRegistrationResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<NewRegistration> getActionType() {
		return NewRegistration.class;
	}
}
