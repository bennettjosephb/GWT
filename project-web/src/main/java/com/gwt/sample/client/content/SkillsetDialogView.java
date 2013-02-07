package com.gwt.sample.client.content;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwt.sample.client.common.widget.MonthAndYearPicker;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.PopupViewImpl;

public class SkillsetDialogView extends PopupViewImpl implements
		SkillsetDialogPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SkillsetDialogView> {
	}

	@Inject
	public SkillsetDialogView(final EventBus eventBus, final Binder binder, DispatchAsync dispatchAsync, DateTimeConstantsImpl dateTimeConstants) {
		super(eventBus);
		lastUsed = new MonthAndYearPicker(dispatchAsync, dateTimeConstants);
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	TextBox skillName;
	@UiField
	TextBox version;
	@UiField(provided = true)
	MonthAndYearPicker lastUsed;
	@UiField
	ListBox expYear;
	@UiField
	ListBox expMonth;
	@UiField
	Button save;
	@UiField
	Button cancel;
	public TextBox getSkillName() {
		return skillName;
	}

	public void setSkillName(TextBox skillName) {
		this.skillName = skillName;
	}

	public TextBox getVersion() {
		return version;
	}

	public void setVersion(TextBox version) {
		this.version = version;
	}

	public MonthAndYearPicker getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(MonthAndYearPicker lastUsed) {
		this.lastUsed = lastUsed;
	}

	public ListBox getExpYear() {
		return expYear;
	}

	public void setExpYear(ListBox expYear) {
		this.expYear = expYear;
	}

	public ListBox getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(ListBox expMonth) {
		this.expMonth = expMonth;
	}

	public Button getSave() {
		return save;
	}

	public void setSave(Button save) {
		this.save = save;
	}

	public Button getCancel() {
		return cancel;
	}

	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}
}
