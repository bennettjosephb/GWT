package au.com.showcase.application.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import au.com.showcase.application.client.FooterPresenter;
import au.com.showcase.application.client.FooterView;
import au.com.showcase.application.client.HeaderPresenter;
import au.com.showcase.application.client.HeaderView;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.login.SignInPagePresenter;
import au.com.showcase.application.client.login.SignInPageView;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.scroll.ScrollTestView;
import au.com.showcase.application.client.scroll.TestInsertPresenter;
import au.com.showcase.application.client.scroll.TestInsertView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(SignInPagePresenter.class,
				SignInPagePresenter.MyView.class, SignInPageView.class,
				SignInPagePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.signin);

		bindSingletonPresenterWidget(HeaderPresenter.class,
				HeaderPresenter.MyView.class, HeaderView.class);

		bindSingletonPresenterWidget(FooterPresenter.class,
				FooterPresenter.MyView.class, FooterView.class);

		bindPresenter(ScrollTestPresenter.class,
				ScrollTestPresenter.MyView.class, ScrollTestView.class,
				ScrollTestPresenter.MyProxy.class);

		bindPresenter(TestInsertPresenter.class,
				TestInsertPresenter.MyView.class, TestInsertView.class,
				TestInsertPresenter.MyProxy.class);

	}
}
