package au.com.showcase.application.server.guice;

import au.com.showcase.application.client.account.NewRegistration;
import au.com.showcase.application.server.NewRegistrationActionHandler;
import au.com.showcase.application.server.RegenerateCaptchaActionHandler;
import au.com.showcase.application.shared.account.RegenerateCaptcha;

import com.gwtplatform.dispatch.server.guice.HandlerModule;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(RegenerateCaptcha.class,
				RegenerateCaptchaActionHandler.class);

		bindHandler(NewRegistration.class, NewRegistrationActionHandler.class);
	}
}
