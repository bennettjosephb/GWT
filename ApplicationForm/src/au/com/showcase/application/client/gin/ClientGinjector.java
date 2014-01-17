package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.ApplicationFormPresenter;
import au.com.showcase.application.client.HomePresenter;
import au.com.showcase.application.client.LoginPresenter;
import au.com.showcase.application.client.NewRegistrationContainerPresenter;
import au.com.showcase.application.client.NewRegistrationPresenter;
import au.com.showcase.application.client.SignUpPresenter;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import au.com.showcase.application.client.scroll.TestInsertPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<HomePresenter> getHomePresenter();

	AsyncProvider<ApplicationFormPresenter> getApplicationFormPresenter();

	AsyncProvider<LoginPresenter> getLoginPresenter();

	AsyncProvider<NewRegistrationPresenter> getNewRegistrationPresenter();

	AsyncProvider<NewRegistrationContainerPresenter> getNewRegistrationContainerPresenter();

	AsyncProvider<SignUpPresenter> getSignUpPresenter();

	AsyncProvider<ScrollTestPresenter> getScrollTestPresenter();

	AsyncProvider<TestInsertPresenter> getTestInsertPresenter();
}
