package au.com.showcase.application.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.TabPresenter;
import au.com.showcase.application.client.TabView;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.TabPanelPresenter;
import au.com.showcase.application.client.TabPanelView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(TabPresenter.class, TabPresenter.MyView.class,
				TabView.class, TabPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);

		bindPresenter(TabPanelPresenter.class, TabPanelPresenter.MyView.class,
				TabPanelView.class, TabPanelPresenter.MyProxy.class);
	}
}
