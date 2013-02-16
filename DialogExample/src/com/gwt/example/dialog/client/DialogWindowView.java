package com.gwt.example.dialog.client;

import com.gwtplatform.mvp.client.PopupViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class DialogWindowView extends PopupViewImpl implements
		DialogWindowPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, DialogWindowView> {
	}

	@Inject
	public DialogWindowView(final EventBus eventBus, final Binder binder) {
		super(eventBus);
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Button close;
	public Button getClose() {
		return close;
	}

	public void setClose(Button close) {
		this.close = close;
	}
}
