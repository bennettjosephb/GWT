package au.com.showcase.application.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.DatePickerPresenter;
import au.com.showcase.application.client.DatePickerView;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(DatePickerPresenter.class,
				DatePickerPresenter.MyView.class, DatePickerView.class,
				DatePickerPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
	}
}
