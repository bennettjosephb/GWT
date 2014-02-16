package au.com.showcase.application.client.ui.process.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;

public class BeneficiaryDetailsEvent extends
		GwtEvent<BeneficiaryDetailsEvent.BeneficiaryDetailsHandler> {

	public static Type<BeneficiaryDetailsHandler> TYPE = new Type<BeneficiaryDetailsHandler>();

	public interface BeneficiaryDetailsHandler extends EventHandler {
		void onBeneficiaryDetails(BeneficiaryDetailsEvent event);
	}

	public BeneficiaryDetailsEvent() {
	}

	@Override
	protected void dispatch(BeneficiaryDetailsHandler handler) {
		handler.onBeneficiaryDetails(this);
	}

	@Override
	public Type<BeneficiaryDetailsHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<BeneficiaryDetailsHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new BeneficiaryDetailsEvent());
	}
}
