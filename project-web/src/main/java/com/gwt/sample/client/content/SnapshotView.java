package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SnapshotView extends ViewImpl implements SnapshotPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SnapshotView> {
	}

	@Inject
	public SnapshotView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
