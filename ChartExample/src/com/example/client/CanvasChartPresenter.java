package com.example.client;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.example.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class CanvasChartPresenter extends
		Presenter<CanvasChartPresenter.MyView, CanvasChartPresenter.MyProxy> {

	public interface MyView extends View {

		public Canvas getCanvas();

		public void setCanvas(Canvas canvas);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.canvaschart)
	public interface MyProxy extends ProxyPlace<CanvasChartPresenter> {
	}

	@Inject
	public CanvasChartPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
