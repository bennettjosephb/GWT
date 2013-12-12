package com.example.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CanvasChartView extends ViewImpl implements
		CanvasChartPresenter.MyView {

	private final Widget widget;

	@UiField(provided = true)
	Canvas canvas;

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public interface Binder extends UiBinder<Widget, CanvasChartView> {
	}

	@Inject
	public CanvasChartView(final Binder binder) {
		canvas = Canvas.createIfSupported();
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
