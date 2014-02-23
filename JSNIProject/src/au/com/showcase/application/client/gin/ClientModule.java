package au.com.showcase.application.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.JSNIExamplePresenter;
import au.com.showcase.application.client.JSNIExampleView;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.SamplePresenter;
import au.com.showcase.application.client.SampleView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(JSNIExamplePresenter.class,
				JSNIExamplePresenter.MyView.class, JSNIExampleView.class,
				JSNIExamplePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);

		bindPresenter(SamplePresenter.class, SamplePresenter.MyView.class,
				SampleView.class, SamplePresenter.MyProxy.class);
	}
}
