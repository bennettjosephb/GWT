package au.com.showcase.application.client.ui.process.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;

public class DealFinishEvent extends
		GwtEvent<DealFinishEvent.DealFinishHandler> {

	public static Type<DealFinishHandler> TYPE = new Type<DealFinishHandler>();

	public interface DealFinishHandler extends EventHandler {
		void onDealFinish(DealFinishEvent event);
	}

	public DealFinishEvent() {
	}

	@Override
	protected void dispatch(DealFinishHandler handler) {
		handler.onDealFinish(this);
	}

	@Override
	public Type<DealFinishHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<DealFinishHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new DealFinishEvent());
	}
}
