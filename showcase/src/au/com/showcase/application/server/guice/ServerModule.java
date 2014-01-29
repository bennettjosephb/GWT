package au.com.showcase.application.server.guice;

import au.com.showcase.application.server.RegenerateCaptchaActionHandler;
import au.com.showcase.application.shared.account.RegenerateCaptcha;

import com.gwtplatform.dispatch.server.guice.HandlerModule;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {
		
		bindHandler(RegenerateCaptcha.class,
				RegenerateCaptchaActionHandler.class);


	}
}
