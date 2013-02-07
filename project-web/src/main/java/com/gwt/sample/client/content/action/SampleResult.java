package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class SampleResult implements Result {

	private String one;

	@SuppressWarnings("unused")
	private SampleResult() {
		// For serialization only
	}

	public SampleResult(String one) {
		this.one = one;
	}

	public String getOne() {
		return one;
	}
}
