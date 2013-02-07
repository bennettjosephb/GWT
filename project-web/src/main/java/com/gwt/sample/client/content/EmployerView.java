package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Button;

public class EmployerView extends ViewImpl implements EmployerPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, EmployerView> {
	}

	@Inject
	public EmployerView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	FlowPanel employerDetailsList;
	@UiField
	Button addEmployer;
	
	public FlowPanel getEmployerDetailsList() {
		return employerDetailsList;
	}

	public void setEmployerDetailsList(FlowPanel employerDetailsList) {
		this.employerDetailsList = employerDetailsList;
	}

	public Button getAddEmployer() {
		return addEmployer;
	}

	public void setAddEmployer(Button addEmployer) {
		this.addEmployer = addEmployer;
	}
}
