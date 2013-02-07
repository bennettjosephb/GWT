package com.gwt.sample.client.content.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import java.lang.String;
import com.google.gwt.event.shared.HasHandlers;

public class SampleEvent extends GwtEvent<SampleEvent.SampleHandler> {

	public static Type<SampleHandler> TYPE = new Type<SampleHandler>();
	private String one;

	public interface SampleHandler extends EventHandler {
		void onSample(SampleEvent event);
	}

	public SampleEvent(String one) {
		this.one = one;
	}

	public String getOne() {
		return one;
	}

	@Override
	protected void dispatch(SampleHandler handler) {
		handler.onSample(this);
	}

	@Override
	public Type<SampleHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<SampleHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String one) {
		source.fireEvent(new SampleEvent(one));
	}
}
