package au.com.showcase.application.server.guice;

import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.Injector;
import com.google.inject.Guice;
import au.com.showcase.application.server.guice.ServerModule;
import au.com.showcase.application.server.guice.DispatchServletModule;

public class GuiceServletConfig extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice
				.createInjector(new ServerModule(), new DispatchServletModule());
	}
}
