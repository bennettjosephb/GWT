package com.gwt.sample.client.login.createaccount;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class CreateAccountHeaderView extends ViewImpl implements
		CreateAccountHeaderPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CreateAccountHeaderView> {
	}

	@Inject
	public CreateAccountHeaderView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
