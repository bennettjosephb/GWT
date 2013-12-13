package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.home.MainContentPresenter;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	// AsyncProvider<PieChartPresenter> getPieChartPresenter();
	//
	// AsyncProvider<CanvasChartPresenter> getCanvasChartPresenter();
	//
	// AsyncProvider<ColumnChartPresenter> getColumnChartPresenter();

	AsyncProvider<MainContentPresenter> getMainContentPresenter();

}
