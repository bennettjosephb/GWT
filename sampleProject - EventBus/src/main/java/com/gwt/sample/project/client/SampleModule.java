package com.gwt.sample.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwt.sample.project.client.gin.ClientGinjector;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SampleModule implements EntryPoint {
	  public final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

//	  @Override
	  public final void onModuleLoad() {
	    // This is required for Gwt-Platform proxy's generator.
	    DelayedBindRegistry.bind(ginjector);

	    ginjector.getPlaceManager().revealCurrentPlace();
	  }
}
