package au.com.showcase.application.client.ui.process.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;

public class CustomerDetailsEvent extends
		GwtEvent<CustomerDetailsEvent.CustomerDetailsHandler> {

	public static Type<CustomerDetailsHandler> TYPE = new Type<CustomerDetailsHandler>();

	public interface CustomerDetailsHandler extends EventHandler {
		void onCustomerDetails(CustomerDetailsEvent event);
	}

	public CustomerDetailsEvent() {
	}

	@Override
	protected void dispatch(CustomerDetailsHandler handler) {
		handler.onCustomerDetails(this);
	}

	@Override
	public Type<CustomerDetailsHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<CustomerDetailsHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new CustomerDetailsEvent());
	}
}
