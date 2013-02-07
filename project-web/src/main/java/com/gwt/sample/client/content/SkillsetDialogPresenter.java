package com.gwt.sample.client.content;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwt.sample.client.common.widget.MonthAndYearPicker;
import com.gwt.sample.client.content.event.SkillsetEvent;
import com.gwt.sample.client.content.event.SkillsetHandler;
import com.gwt.sample.client.content.action.SkillsetAction;
import com.gwt.sample.client.content.action.SkillsetActionResult;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class SkillsetDialogPresenter extends
		PresenterWidget<SkillsetDialogPresenter.MyView> {

	public interface MyView extends PopupView {
		public TextBox getSkillName();

		public void setSkillName(TextBox skillName);

		public TextBox getVersion();

		public void setVersion(TextBox version);

		public MonthAndYearPicker getLastUsed();

		public void setLastUsed(MonthAndYearPicker lastUsed);

		public ListBox getExpYear();

		public void setExpYear(ListBox expYear);

		public ListBox getExpMonth();

		public void setExpMonth(ListBox expMonth);

		public Button getSave();

		public void setSave(Button save);

		public Button getCancel();

		public void setCancel(Button cancel);
	}

	private EventBus eventBus;

	@Inject
	PlaceManager placeManager;

	@Inject
	DispatchAsync dispatchAsync;

	private SkillsetHandler skillsetHandler = new SkillsetHandler() {
		@Override
		public void onSkillset(SkillsetEvent event) {
			SkillsetAction skillsetAction = new SkillsetAction(
					event.getSkillName(), event.getVersion(),
					event.getExpYear(), event.getExpMonth(),
					event.getLastUsedYear(), event.getLastUsedMonth());
			dispatchAsync.execute(skillsetAction, skillsetActionResult);
		}
	};

	@Inject
	public SkillsetDialogPresenter(final EventBus eventBus, final MyView view) {
		super(eventBus, view);
		this.eventBus = eventBus;

	}

	private final AsyncCallback<SkillsetActionResult> skillsetActionResult = new AsyncCallback<SkillsetActionResult>() {

		@Override
		public void onSuccess(SkillsetActionResult result) {
		}

		@Override
		public void onFailure(Throwable caught) {
		}
	};

	@Override
	protected void onBind() {
		super.onBind();
		getView().getSave().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				SkillsetEvent skillsetEvent = new SkillsetEvent(getView()
						.getSkillName().getText(), getView().getVersion()
						.getText(), getView().getLastUsed().getSelectedMonth(),
						getView().getLastUsed().getSelectedYear(), Integer
								.valueOf(getView().getExpYear().getValue(
										getView().getExpYear()
												.getSelectedIndex())), Integer
								.valueOf(getView().getExpMonth().getValue(
										getView().getExpMonth()
												.getSelectedIndex())));
				eventBus.fireEvent(skillsetEvent);
				getView().hide();
			}
		});
		eventBus.addHandler(SkillsetEvent.TYPE, skillsetHandler);

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
		for (Integer i = 1; i < 12; i++) {
			getView().getExpMonth().addItem(i.toString(), i.toString());
		}
		for (Integer i = 1; i < 25; i++) {
			getView().getExpYear().addItem(i.toString(), i.toString());
		}
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
