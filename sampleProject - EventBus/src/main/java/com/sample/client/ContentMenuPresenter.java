package com.sample.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.sample.client.event.UserEvent;

public class ContentMenuPresenter extends
		PresenterWidget<ContentMenuPresenter.MyView> {
	
	private EventBus eventBus;

	public interface MyView extends View {
		Button getUserButton();

		TextBox getFirstName();

		TextBox getLastName();
	}

	@Inject
	public ContentMenuPresenter(final EventBus eventBus, final MyView view) {
		super(eventBus, view);
		this.eventBus = eventBus;
	}

	@Override
	protected void onBind() {
		super.onBind();
		getView().getUserButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				UserEvent userEvent = new UserEvent(getView().getFirstName().getText(), getView().getLastName().getText());
				eventBus.fireEvent(userEvent);
			}
		});
	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
