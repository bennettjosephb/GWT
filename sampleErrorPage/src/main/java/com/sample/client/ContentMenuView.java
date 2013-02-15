package com.sample.client;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ContentMenuView extends ViewImpl implements
		ContentMenuPresenter.MyView {

	private final Widget widget;
	
	public interface Binder extends UiBinder<Widget, ContentMenuView> {
	}

	@Inject
	public ContentMenuView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public Button getUserButton() {
		return userButton;
	}
	@Override
	public TextBox getFirstName() {
		return firstName;
	}
	@Override
	public TextBox getLastName() {
		return lastName;
	}
	@UiField Button userButton;
	@UiField TextBox firstName;
	@UiField TextBox lastName;
}
