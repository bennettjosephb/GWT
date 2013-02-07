package com.gwt.sample.client.login.createaccount;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class CreateAccountFooterView extends ViewImpl implements
		CreateAccountFooterPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CreateAccountFooterView> {
	}

	@Inject
	public CreateAccountFooterView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
