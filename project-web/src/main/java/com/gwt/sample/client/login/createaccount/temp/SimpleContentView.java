package com.gwt.sample.client.login.createaccount.temp;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class SimpleContentView extends ViewImpl implements
		SimpleContentPresenter.MyView {

	private final Widget widget;
	
	public interface Binder extends UiBinder<Widget, SimpleContentView> {
	}

	@Inject
	public SimpleContentView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

}
