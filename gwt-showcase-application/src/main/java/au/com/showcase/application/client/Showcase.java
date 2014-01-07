package au.com.showcase.application.client;

import au.com.showcase.application.client.gin.ClientGinjector;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Showcase implements EntryPoint {
	// private final Messages messages = GWT.create(Messages.class);

	protected final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

	public void onModuleLoad() {
		// This is required for Gwt-Platform proxy's generator
		DelayedBindRegistry.bind(ginjector);

		ginjector.getPlaceManager().revealCurrentPlace();
		
	}
}
