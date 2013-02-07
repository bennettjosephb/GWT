package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ManageCoverLetterView extends ViewImpl implements
		ManageCoverLetterPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ManageCoverLetterView> {
	}

	@Inject
	public ManageCoverLetterView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
