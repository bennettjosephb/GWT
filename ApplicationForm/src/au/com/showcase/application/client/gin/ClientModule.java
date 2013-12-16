package au.com.showcase.application.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.HomePresenter;
import au.com.showcase.application.client.HomeView;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.ApplicationFormPresenter;
import au.com.showcase.application.client.ApplicationFormView;
import au.com.showcase.application.client.LoginPresenter;
import au.com.showcase.application.client.LoginView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,
				HomeView.class, HomePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);

		bindPresenter(ApplicationFormPresenter.class,
				ApplicationFormPresenter.MyView.class,
				ApplicationFormView.class,
				ApplicationFormPresenter.MyProxy.class);

		bindPresenter(LoginPresenter.class, LoginPresenter.MyView.class,
				LoginView.class, LoginPresenter.MyProxy.class);
	}
}
