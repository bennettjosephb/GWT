package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class VisibilitySettingsView extends ViewImpl implements
		VisibilitySettingsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, VisibilitySettingsView> {
	}

	@Inject
	public VisibilitySettingsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
