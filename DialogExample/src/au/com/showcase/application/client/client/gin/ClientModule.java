package au.com.showcase.application.client.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.client.place.ClientPlaceManager;
import au.com.showcase.application.client.client.FlipDialogPresenter;
import au.com.showcase.application.client.client.FlipDialogView;
import au.com.showcase.application.client.client.place.DefaultPlace;
import au.com.showcase.application.client.client.place.NameTokens;
import au.com.showcase.application.client.client.VerticalFlipDialogPresenter;
import au.com.showcase.application.client.client.VerticalFlipDialogView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(FlipDialogPresenter.class,
				FlipDialogPresenter.MyView.class, FlipDialogView.class,
				FlipDialogPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.flip);

		bindPresenterWidget(VerticalFlipDialogPresenter.class,
				VerticalFlipDialogPresenter.MyView.class,
				VerticalFlipDialogView.class);
	}
}
