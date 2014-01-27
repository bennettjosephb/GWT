package au.com.showcase.application.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import au.com.showcase.application.client.account.RegenerateCaptcha;
import au.com.showcase.application.server.RegenerateCaptchaActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(RegenerateCaptcha.class,
				RegenerateCaptchaActionHandler.class);
	}
}
