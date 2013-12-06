package au.com.example.gwt.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import au.com.example.gwt.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import au.com.example.gwt.client.home.HomePresenter;
import au.com.example.gwt.client.widget.TextboxPresenter;
import au.com.example.gwt.client.widget.CustomizedTextboxPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<HomePresenter> getHomePresenter();

	AsyncProvider<TextboxPresenter> getTextboxPresenter();

	AsyncProvider<CustomizedTextboxPresenter> getCustomizedTextboxPresenter();
}
