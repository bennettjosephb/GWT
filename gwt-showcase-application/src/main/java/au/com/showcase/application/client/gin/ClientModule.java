package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.place.ClientPlaceManager;
import au.com.showcase.application.client.place.DefaultPlace;
import au.com.showcase.application.client.place.NameTokens;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import au.com.showcase.application.client.home.MainContentPresenter;
import au.com.showcase.application.client.home.MainContentView;
import au.com.showcase.application.client.home.MainMenuPresenter;
import au.com.showcase.application.client.home.MainMenuView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

//		bindPresenter(PieChartPresenter.class, PieChartPresenter.MyView.class,
//				PieChartView.class, PieChartPresenter.MyProxy.class);

//		bindConstant().annotatedWith(DefaultPlace.class)
//				.to(NameTokens.home);
//

//				bindPresenter(CanvasChartPresenter.class,
//				CanvasChartPresenter.MyView.class, CanvasChartView.class,
//				CanvasChartPresenter.MyProxy.class);

//		bindPresenter(ColumnChartPresenter.class,
//				ColumnChartPresenter.MyView.class, ColumnChartView.class,
//				ColumnChartPresenter.MyProxy.class);

		bindPresenter(MainContentPresenter.class,
				MainContentPresenter.MyView.class, MainContentView.class,
				MainContentPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);

		bindPresenterWidget(MainMenuPresenter.class,
				MainMenuPresenter.MyView.class, MainMenuView.class);
	}
}
