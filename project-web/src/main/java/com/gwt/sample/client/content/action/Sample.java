package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.gwt.sample.client.content.action.SampleResult;
import java.lang.String;

public class Sample extends ActionImpl<SampleResult> {

	private String one;

	@SuppressWarnings("unused")
	private Sample() {
		// For serialization only
	}

	public Sample(String one) {
		this.one = one;
	}

	public String getOne() {
		return one;
	}
}
