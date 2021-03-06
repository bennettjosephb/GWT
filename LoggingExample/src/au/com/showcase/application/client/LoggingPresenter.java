package au.com.showcase.application.client;

//import java.util.logging.Level;
//import java.util.logging.LogRecord;
//import java.util.logging.Logger;

import au.com.showcase.application.client.place.NameTokens;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.logging.client.SimpleRemoteLogHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class LoggingPresenter extends
		Presenter<LoggingPresenter.MyView, LoggingPresenter.MyProxy> {

	public interface MyView extends View {
		public Button getButton();

		public void setButton(Button button);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<LoggingPresenter> {
	}

	@Inject
	public LoggingPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

//	Logger logger = Logger.getLogger("");
//	Logger logger1 = Logger.getLogger(LoggingPresenter.class.getName());
	
	SimpleRemoteLogHandler remoteLog = new SimpleRemoteLogHandler();

	@Override
	protected void onBind() {
		super.onBind();

		getView().getButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				for (int i = 0; i < 2; i++) {
//					logger1.log(Level.ALL, "this message should get logged" +i);
//					remoteLog.publish(new LogRecord(Level.INFO, "log message"));
					Log.error("THIS IS ERROR");
					Log.info("THIS IS INFO");
					Log.fatal("THIS IS FATAL");
					Log.warn("THIS IS WARN");
					Log.debug("THIS IS DEBUG");
					Log.trace("THIS IS TRACE");
					
				}

			}
		});
	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
