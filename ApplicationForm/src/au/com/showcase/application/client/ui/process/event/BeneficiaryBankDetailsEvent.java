package au.com.showcase.application.client.ui.process.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.HasHandlers;

public class BeneficiaryBankDetailsEvent extends
		GwtEvent<BeneficiaryBankDetailsEvent.BeneficiaryBankDetailsHandler> {

	public static Type<BeneficiaryBankDetailsHandler> TYPE = new Type<BeneficiaryBankDetailsHandler>();

	public interface BeneficiaryBankDetailsHandler extends EventHandler {
		void onBeneficiaryBankDetails(BeneficiaryBankDetailsEvent event);
	}

	public BeneficiaryBankDetailsEvent() {
	}

	@Override
	protected void dispatch(BeneficiaryBankDetailsHandler handler) {
		handler.onBeneficiaryBankDetails(this);
	}

	@Override
	public Type<BeneficiaryBankDetailsHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<BeneficiaryBankDetailsHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source) {
		source.fireEvent(new BeneficiaryBankDetailsEvent());
	}
}
