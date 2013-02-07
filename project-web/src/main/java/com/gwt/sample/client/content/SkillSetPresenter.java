package com.gwt.sample.client.content;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.inject.Inject;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class SkillSetPresenter extends
		Presenter<SkillSetPresenter.MyView, SkillSetPresenter.MyProxy> {

	public interface MyView extends View {
		public Button getAddSkill();

		public void setAddSkill(Button addSkill);

		public FlowPanel getListSkills();

		public void setListSkills(FlowPanel listSkills);
	}

	@Inject
	SkillsetDialogPresenter skillsetDialogPresenter;

	@ProxyCodeSplit
	@NameToken(NameTokens.skill)
	public interface MyProxy extends ProxyPlace<SkillSetPresenter> {
	}

	@Inject
	public SkillSetPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
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
		addClickHandlers();
	}

	private void addClickHandlers() {
		getView().getAddSkill().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				addToPopupSlot(skillsetDialogPresenter);
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
