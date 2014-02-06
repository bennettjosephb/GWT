package au.com.showcase.application.server.guice;

import au.com.showcase.application.client.account.NewRegistration;
import au.com.showcase.application.server.NewRegistrationActionHandler;
import au.com.showcase.application.server.PendingTransactionActionHandler;
import au.com.showcase.application.server.RegenerateCaptchaActionHandler;
import au.com.showcase.application.shared.account.RegenerateCaptcha;
import au.com.showcase.application.shared.counter.action.PendingTransactions;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import au.com.showcase.application.shared.counter.action.GetPendingTransaction;
import au.com.showcase.application.server.counter.action.GetPendingTransactionActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(RegenerateCaptcha.class,
				RegenerateCaptchaActionHandler.class);

		bindHandler(NewRegistration.class, NewRegistrationActionHandler.class);

		bindHandler(PendingTransactions.class,
				PendingTransactionActionHandler.class);

		bindHandler(GetPendingTransaction.class,
				GetPendingTransactionActionHandler.class);
	}
}
