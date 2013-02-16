package com.sample.client.gin;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.sample.client.ContainerPresenter;
import com.sample.client.ContentPresenter;
import com.sample.client.RestrictedPresenter;
import com.sample.client.error.ErrorPresenter;
import com.sample.client.filter.SampleGateKeeper;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<ContainerPresenter> getContainerPresenter();

	AsyncProvider<ContentPresenter> getContentPresenter();

	AsyncProvider<ErrorPresenter> getErrorPresenter();

	AsyncProvider<RestrictedPresenter> getRestrictedPresenter();
	
	SampleGateKeeper getSampleGateKeeper();

}