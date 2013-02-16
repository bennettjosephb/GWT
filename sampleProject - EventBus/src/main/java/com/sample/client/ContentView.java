package com.sample.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class ContentView extends ViewImpl implements ContentPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContentView> {
	}

	@Inject
	public ContentView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Label sampleLabel;

	@Override
	public Label getSampleLabel() {
		return sampleLabel;
	}
}
