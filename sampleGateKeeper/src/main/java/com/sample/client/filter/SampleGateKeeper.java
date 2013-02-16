package com.sample.client.filter;

import com.gwtplatform.mvp.client.proxy.Gatekeeper;

public class SampleGateKeeper implements Gatekeeper {

	@Override
	public boolean canReveal() {
		return false;
	}

}