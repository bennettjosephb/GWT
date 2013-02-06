package com.gwt.example.dialog.client;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class DialogExampleView extends ViewImpl implements
		DialogExamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, DialogExampleView> {
	}

	@Inject
	public DialogExampleView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	@UiField Button button;
	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}
}
