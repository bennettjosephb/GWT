package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.SuggestBox;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwt.sample.client.content.ContentContainerPresenter;

public class CurrentDetailsOverviewPresenter
		extends
		Presenter<CurrentDetailsOverviewPresenter.MyView, CurrentDetailsOverviewPresenter.MyProxy> {

	public interface MyView extends View {

		public SuggestBox getCurrentDesignation();

		public void setCurrentDesignation(SuggestBox currentDesignation);

		public SuggestBox getCurrentCompany();

		public void setCurrentCompany(SuggestBox currentCompany);

		public SuggestBox getCurrentLocation();

		public void setCurrentLocation(SuggestBox currentLocation);

		public SuggestBox getPreferredLocation();

		public void setPreferredLocation(SuggestBox preferredLocation);

		public SuggestBox getFunctionalArea();

		public void setFunctionalArea(SuggestBox functionalArea);

		public SuggestBox getRole();

		public void setRole(SuggestBox role);

		public ListBox getCategory();

		public void setCategory(ListBox category);

		public ListBox getSubCategory();

		public void setSubCategory(ListBox subCategory);

		public SubmitButton getSaveCurrentDetails();

		public void setSaveCurrentDetails(SubmitButton saveCurrentDetails);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.currentdetails)
	public interface MyProxy extends
			ProxyPlace<CurrentDetailsOverviewPresenter> {
	}

	@Inject
	public CurrentDetailsOverviewPresenter(final EventBus eventBus,
			final MyView view, final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this,
				ContentContainerPresenter.MAIN_CONTENT_SLOT, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
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
