package com.gwt.sample.server.content.action;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwt.sample.client.content.action.SkillsetAction;
import com.gwt.sample.client.content.action.SkillsetActionResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class SkillsetActionHandler implements
		ActionHandler<SkillsetAction, SkillsetActionResult> {

	@Inject
	public SkillsetActionHandler() {
	}

	@Override
	public SkillsetActionResult execute(SkillsetAction action,
			ExecutionContext context) throws ActionException {
		System.out.println(action.getServiceName()+action.getSkillName()+action.getVersion()+action.getExpMonth()+action.getExpYear()+action.getLastUsedMonth()+action.getLastUsedYear());
		return null;
	}

	@Override
	public void undo(SkillsetAction action, SkillsetActionResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<SkillsetAction> getActionType() {
		return SkillsetAction.class;
	}
}
