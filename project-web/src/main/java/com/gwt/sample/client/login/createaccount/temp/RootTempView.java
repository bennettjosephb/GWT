package com.gwt.sample.client.login.createaccount.temp;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;

public class RootTempView extends ViewImpl implements RootTempPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, RootTempView> {
	}

	@Inject
	public RootTempView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField HTMLPanel contentPanel;
}
