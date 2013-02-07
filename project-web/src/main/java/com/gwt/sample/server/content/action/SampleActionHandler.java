package com.gwt.sample.server.content.action;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwt.sample.client.content.action.Sample;
import com.gwt.sample.client.content.action.SampleResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class SampleActionHandler implements ActionHandler<Sample, SampleResult> {

	@Inject
	public SampleActionHandler() {
	}

	@Override
	public SampleResult execute(Sample action, ExecutionContext context)
			throws ActionException {
		return null;
	}

	@Override
	public void undo(Sample action, SampleResult result, ExecutionContext context)
			throws ActionException {
	}

	@Override
	public Class<Sample> getActionType() {
		return Sample.class;
	}
}
