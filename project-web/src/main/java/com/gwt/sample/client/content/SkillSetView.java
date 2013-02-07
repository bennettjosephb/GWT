package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SkillSetView extends ViewImpl implements SkillSetPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SkillSetView> {
	}

	@Inject
	public SkillSetView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button addSkill;
	@UiField
	FlowPanel listSkills;

	public Button getAddSkill() {
		return addSkill;
	}

	public void setAddSkill(Button addSkill) {
		this.addSkill = addSkill;
	}

	public FlowPanel getListSkills() {
		return listSkills;
	}

	public void setListSkills(FlowPanel listSkills) {
		this.listSkills = listSkills;
	}
}
