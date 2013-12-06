package au.com.example.gwt.client.gin;

import au.com.example.gwt.client.home.HomePresenter;
import au.com.example.gwt.client.home.HomeView;
import au.com.example.gwt.client.home.WelcomePresenter;
import au.com.example.gwt.client.home.WelcomeView;
import au.com.example.gwt.client.home.menu.ExampleListPresenter;
import au.com.example.gwt.client.home.menu.ExampleListView;
import au.com.example.gwt.client.place.ClientPlaceManager;
import au.com.example.gwt.client.place.DefaultPlace;
import au.com.example.gwt.client.place.NameTokens;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.example.gwt.client.widget.TextboxPresenter;
import au.com.example.gwt.client.widget.TextboxView;
import au.com.example.gwt.client.widget.CustomizedTextboxPresenter;
import au.com.example.gwt.client.widget.CustomizedTextboxView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,
				HomeView.class, HomePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);

		bindPresenterWidget(ExampleListPresenter.class,
				ExampleListPresenter.MyView.class, ExampleListView.class);

		bindPresenterWidget(WelcomePresenter.class,
				WelcomePresenter.MyView.class, WelcomeView.class);


		bindPresenter(TextboxPresenter.class, TextboxPresenter.MyView.class,
				TextboxView.class, TextboxPresenter.MyProxy.class);

		bindPresenter(CustomizedTextboxPresenter.class,
				CustomizedTextboxPresenter.MyView.class,
				CustomizedTextboxView.class,
				CustomizedTextboxPresenter.MyProxy.class);
	}
}
