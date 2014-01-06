package au.com.showcase.application.client;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class GetDataResult implements Result {

	private String result;

	@SuppressWarnings("unused")
	private GetDataResult() {
		// For serialization only
	}

	public GetDataResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}
}
