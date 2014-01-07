package au.com.showcase.application.client;

import com.gwtplatform.dispatch.shared.ActionImpl;

import au.com.showcase.application.client.TestingHandlerResult;
import au.com.showcase.application.client.DataSet;

public class TestingHandler extends ActionImpl<TestingHandlerResult> {

	private DataSet dataset;

	@Override
	public boolean isSecured() {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unused")
	private TestingHandler() {
		// For serialization only
	}

	public TestingHandler(DataSet dataset) {
		this.dataset = dataset;
	}

	public DataSet getDataset() {
		return dataset;
	}
}
