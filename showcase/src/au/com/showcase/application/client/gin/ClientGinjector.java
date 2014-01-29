package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.login.SignInPagePresenter;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.scroll.TestInsertPresenter;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<ScrollTestPresenter> getScrollTestPresenter();

	AsyncProvider<TestInsertPresenter> getTestInsertPresenter();

	AsyncProvider<SignInPagePresenter> getSignInPagePresenter();
}
