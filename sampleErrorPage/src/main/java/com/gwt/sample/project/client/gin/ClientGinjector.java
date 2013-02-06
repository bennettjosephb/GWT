package com.gwt.sample.project.client.gin;


//import com.google.gwt.event.shared.EventBus;
import com.google.web.bindery.event.shared.EventBus;
//import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import com.gwt.sample.project.client.SamplePresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<SamplePresenter> getSamplePresenter();
}
