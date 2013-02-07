package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SubmitButton;

public class CurrentDetailsOverviewView extends ViewImpl implements
		CurrentDetailsOverviewPresenter.MyView {

	private final Widget widget;

	public interface Binder extends
			UiBinder<Widget, CurrentDetailsOverviewView> {
	}

	@Inject
	public CurrentDetailsOverviewView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	SuggestBox currentCompany;
	@UiField
	SuggestBox currentLocation;
	@UiField
	SuggestBox preferredLocation;
	@UiField
	SuggestBox functionalArea;
	@UiField
	SuggestBox role;
	@UiField
	ListBox category;
	@UiField
	ListBox subCategory;
	@UiField
	SubmitButton saveCurrentDetails;
	@UiField
	SuggestBox currentDesignation;

	public SuggestBox getCurrentDesignation() {
		return currentDesignation;
	}

	public void setCurrentDesignation(SuggestBox currentDesignation) {
		this.currentDesignation = currentDesignation;
	}

	public SuggestBox getCurrentCompany() {
		return currentCompany;
	}

	public void setCurrentCompany(SuggestBox currentCompany) {
		this.currentCompany = currentCompany;
	}

	public SuggestBox getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(SuggestBox currentLocation) {
		this.currentLocation = currentLocation;
	}

	public SuggestBox getPreferredLocation() {
		return preferredLocation;
	}

	public void setPreferredLocation(SuggestBox preferredLocation) {
		this.preferredLocation = preferredLocation;
	}

	public SuggestBox getFunctionalArea() {
		return functionalArea;
	}

	public void setFunctionalArea(SuggestBox functionalArea) {
		this.functionalArea = functionalArea;
	}

	public SuggestBox getRole() {
		return role;
	}

	public void setRole(SuggestBox role) {
		this.role = role;
	}

	public ListBox getCategory() {
		return category;
	}

	public void setCategory(ListBox category) {
		this.category = category;
	}

	public ListBox getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(ListBox subCategory) {
		this.subCategory = subCategory;
	}

	public SubmitButton getSaveCurrentDetails() {
		return saveCurrentDetails;
	}

	public void setSaveCurrentDetails(SubmitButton saveCurrentDetails) {
		this.saveCurrentDetails = saveCurrentDetails;
	}
}
