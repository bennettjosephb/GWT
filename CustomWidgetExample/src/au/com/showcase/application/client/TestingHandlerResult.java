package au.com.showcase.application.client;

import com.gwtplatform.dispatch.shared.Result;

import au.com.showcase.application.shared.ResultData;

public class TestingHandlerResult implements Result {

	private ResultData resultdate;

	private TestingHandlerResult() {
		// For serialization only
	}

	public TestingHandlerResult(ResultData resultdate) {
		this.resultdate = resultdate;
	}

	public ResultData getResultdate() {
		return resultdate;
	}
}
