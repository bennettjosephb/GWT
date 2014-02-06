package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.ApplicationFormPresenter;
import au.com.showcase.application.client.ApplicationFormView;
import au.com.showcase.application.client.FooterPresenter;
import au.com.showcase.application.client.FooterView;
import au.com.showcase.application.client.HeaderPresenter;
import au.com.showcase.application.client.HeaderView;
import au.com.showcase.application.client.HomePresenter;
import au.com.showcase.application.client.HomeView;
import au.com.showcase.application.client.LoginPresenter;
import au.com.showcase.application.client.LoginView;
import au.com.showcase.application.client.NewRegistrationContainerPresenter;
import au.com.showcase.application.client.NewRegistrationContainerView;
import au.com.showcase.application.client.NewRegistrationPresenter;
import au.com.showcase.application.client.NewRegistrationView;
import au.com.showcase.application.client.SignUpPresenter;
import au.com.showcase.application.client.SignUpView;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.scroll.ScrollTestView;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.scroll.TestInsertPresenter;
import au.com.showcase.application.client.scroll.TestInsertView;
import au.com.showcase.application.client.ui.process.CustomerDetailPresenter;
import au.com.showcase.application.client.ui.process.CustomerDetailView;
import au.com.showcase.application.client.counter.MainPresenter;
import au.com.showcase.application.client.counter.MainView;

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

		bindPresenter(NewRegistrationPresenter.class,
				NewRegistrationPresenter.MyView.class,
				NewRegistrationView.class,
				NewRegistrationPresenter.MyProxy.class);

		bindPresenter(NewRegistrationContainerPresenter.class,
				NewRegistrationContainerPresenter.MyView.class,
				NewRegistrationContainerView.class,
				NewRegistrationContainerPresenter.MyProxy.class);

		bindSingletonPresenterWidget(HeaderPresenter.class,
				HeaderPresenter.MyView.class, HeaderView.class);

		bindSingletonPresenterWidget(FooterPresenter.class,
				FooterPresenter.MyView.class, FooterView.class);

		bindPresenter(SignUpPresenter.class, SignUpPresenter.MyView.class,
				SignUpView.class, SignUpPresenter.MyProxy.class);

		bindPresenter(ScrollTestPresenter.class,
				ScrollTestPresenter.MyView.class, ScrollTestView.class,
				ScrollTestPresenter.MyProxy.class);

		bindPresenter(TestInsertPresenter.class,
				TestInsertPresenter.MyView.class, TestInsertView.class,
				TestInsertPresenter.MyProxy.class);

		bindPresenter(CustomerDetailPresenter.class,
				CustomerDetailPresenter.MyView.class, CustomerDetailView.class,
				CustomerDetailPresenter.MyProxy.class);

		bindPresenter(MainPresenter.class, MainPresenter.MyView.class,
				MainView.class, MainPresenter.MyProxy.class);
	}
}
