package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ManageResumeView extends ViewImpl implements
		ManageResumePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ManageResumeView> {
	}

	@Inject
	public ManageResumeView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
