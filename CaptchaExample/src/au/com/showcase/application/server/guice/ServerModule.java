package au.com.showcase.application.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import au.com.showcase.application.client.ImageAction;
import au.com.showcase.application.server.ImageActionActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(ImageAction.class, ImageActionActionHandler.class);
	}
}
