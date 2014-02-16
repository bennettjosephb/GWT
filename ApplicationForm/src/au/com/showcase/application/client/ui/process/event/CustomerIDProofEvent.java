package au.com.showcase.application.client.ui.process.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;

public class CustomerIDProofEvent extends
		GwtEvent<CustomerIDProofEvent.CustomerIDProofHandler> {

	public static Type<CustomerIDProofHandler> TYPE = new Type<CustomerIDProofHandler>();

	public interface CustomerIDProofHandler extends EventHandler {
		void onCustomerIDProof(CustomerIDProofEvent event);
	}

	public CustomerIDProofEvent() {
	}

	@Override
	protected void dispatch(CustomerIDProofHandler handler) {
		handler.onCustomerIDProof(this);
	}

	@Override
	public Type<CustomerIDProofHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<CustomerIDProofHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new CustomerIDProofEvent());
	}
}
