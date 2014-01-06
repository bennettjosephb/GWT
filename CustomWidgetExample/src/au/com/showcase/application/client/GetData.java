package au.com.showcase.application.client;

import com.gwtplatform.dispatch.shared.ActionImpl;
import au.com.showcase.application.client.GetDataResult;
import java.lang.String;

public class GetData extends ActionImpl<GetDataResult> {

	private String one;
	
	@Override
	public boolean isSecured() {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unused")
	private GetData() {
		// For serialization only
	}

	public GetData(String one) {
		this.one = one;
	}

	public String getOne() {
		return one;
	}
}
