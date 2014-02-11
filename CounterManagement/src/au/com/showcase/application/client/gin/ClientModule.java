package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.ContentPresenter;
import au.com.showcase.application.client.ContentView;
import au.com.showcase.application.client.CurrentTransactionPresenter;
import au.com.showcase.application.client.CurrentTransactionView;
import au.com.showcase.application.client.FeedTransactionPresenter;
import au.com.showcase.application.client.FeedTransactionView;
import au.com.showcase.application.client.FooterPresenter;
import au.com.showcase.application.client.FooterView;
import au.com.showcase.application.client.HeaderPresenter;
import au.com.showcase.application.client.HeaderView;
import au.com.showcase.application.client.HomePresenter;
import au.com.showcase.application.client.HomeView;
import au.com.showcase.application.client.MenuPresenter;
import au.com.showcase.application.client.MenuView;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,
				HomeView.class, HomePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);

		bindPresenterWidget(FeedTransactionPresenter.class,
				FeedTransactionPresenter.MyView.class,
				FeedTransactionView.class);

		bindPresenterWidget(CurrentTransactionPresenter.class,
				CurrentTransactionPresenter.MyView.class,
				CurrentTransactionView.class);

		bindPresenterWidget(HeaderPresenter.class,
				HeaderPresenter.MyView.class, HeaderView.class);

		bindPresenterWidget(FooterPresenter.class,
				FooterPresenter.MyView.class, FooterView.class);

		bindPresenterWidget(MenuPresenter.class, MenuPresenter.MyView.class,
				MenuView.class);

		bindPresenter(ContentPresenter.class, ContentPresenter.MyView.class,
				ContentView.class, ContentPresenter.MyProxy.class);
	}
}
