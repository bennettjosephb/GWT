package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.Sample1Presenter;
import au.com.showcase.application.client.Sample1View;
import au.com.showcase.application.client.SamplePresenter;
import au.com.showcase.application.client.SampleView;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.RadioButtonPresenter;
import au.com.showcase.application.client.RadioButtonView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));
		
		bindPresenter(SamplePresenter.class, SamplePresenter.MyView.class,
				SampleView.class, SamplePresenter.MyProxy.class);

		bindPresenter(Sample1Presenter.class, Sample1Presenter.MyView.class,
				Sample1View.class, Sample1Presenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.sample1);

		bindPresenter(RadioButtonPresenter.class,
				RadioButtonPresenter.MyView.class, RadioButtonView.class,
				RadioButtonPresenter.MyProxy.class);
	}
}
