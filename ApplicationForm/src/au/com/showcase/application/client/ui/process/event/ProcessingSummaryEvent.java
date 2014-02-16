package au.com.showcase.application.client.ui.process.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;

public class ProcessingSummaryEvent extends
		GwtEvent<ProcessingSummaryEvent.ProcessingSummaryHandler> {

	public static Type<ProcessingSummaryHandler> TYPE = new Type<ProcessingSummaryHandler>();

	public interface ProcessingSummaryHandler extends EventHandler {
		void onProcessingSummary(ProcessingSummaryEvent event);
	}

	public ProcessingSummaryEvent() {
	}

	@Override
	protected void dispatch(ProcessingSummaryHandler handler) {
		handler.onProcessingSummary(this);
	}

	@Override
	public Type<ProcessingSummaryHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<ProcessingSummaryHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new ProcessingSummaryEvent());
	}
}
