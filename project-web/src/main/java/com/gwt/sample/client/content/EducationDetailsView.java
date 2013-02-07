package com.gwt.sample.client.content;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class EducationDetailsView extends ViewImpl implements
		EducationDetailsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, EducationDetailsView> {
	}

	@Inject
	public EducationDetailsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	
	@UiField
	FlowPanel listEducationDetails;
	@UiField
	Button addEducation;
	public FlowPanel getListEducationDetails() {
		return listEducationDetails;
	}

	public void setListEducationDetails(FlowPanel listEducationDetails) {
		this.listEducationDetails = listEducationDetails;
	}

	public Button getAddEducation() {
		return addEducation;
	}

	public void setAddEducation(Button addEducation) {
		this.addEducation = addEducation;
	}

}
