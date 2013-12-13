package com.example.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.example.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import com.example.client.PieChartPresenter;
import com.example.client.CanvasChartPresenter;
import com.example.client.ColumnChartPresenter;
import com.example.client.LineChartPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<PieChartPresenter> getPieChartPresenter();

	AsyncProvider<CanvasChartPresenter> getCanvasChartPresenter();

	AsyncProvider<ColumnChartPresenter> getColumnChartPresenter();

	AsyncProvider<LineChartPresenter> getLineChartPresenter();
}
