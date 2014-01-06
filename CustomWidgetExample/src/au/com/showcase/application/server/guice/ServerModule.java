package au.com.showcase.application.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import au.com.showcase.application.client.TestingHandler;
import au.com.showcase.application.server.TestingHandlerActionHandler;
import au.com.showcase.application.client.GetData;
import au.com.showcase.application.server.GetDataActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(TestingHandler.class, TestingHandlerActionHandler.class);

		bindHandler(GetData.class, GetDataActionHandler.class);
	}
}
