package au.com.showcase.application.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import au.com.showcase.application.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import au.com.showcase.application.client.SamplePresenter;
import au.com.showcase.application.client.Sample1Presenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<SamplePresenter> getSamplePresenter();

	AsyncProvider<Sample1Presenter> getSample1Presenter();
}
