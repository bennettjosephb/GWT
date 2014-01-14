package au.com.showcase.application.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.login.SignInPagePresenter;
import au.com.showcase.application.client.login.SignInPageView;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(SignInPagePresenter.class,
				SignInPagePresenter.MyView.class, SignInPageView.class,
				SignInPagePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.signin);
	}
}
