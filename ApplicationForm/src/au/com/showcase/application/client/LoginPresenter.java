package au.com.showcase.application.client;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class LoginPresenter extends
		Presenter<LoginPresenter.MyView, LoginPresenter.MyProxy> {

	private final Messages messages = GWT.create(Messages.class);
	
	private final Resources cssResources = GWT.create(Resources.class);
	

	public interface MyView extends View {
		public TextBox getUsername();

		public void setUsername(TextBox username);

		public Label getUsernameError();

		public void setUsernameError(Label usernameError);

		public PasswordTextBox getPassword();

		public void setPassword(PasswordTextBox password);

		public Label getPasswordError();

		public void setPasswordError(Label passwordError);

		public SubmitButton getSubmit();

		public void setSubmit(SubmitButton submit);

		public FormPanel getForm();

		public void setForm(FormPanel form);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.login)
	public interface MyProxy extends ProxyPlace<LoginPresenter> {
	}

	@Inject
	public LoginPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
		cssResources.INSTANCE.Login().ensureInjected();
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		getView().getUsername().getElement()
				.setAttribute("placeholder", "Username");
		getView().getUsername().getElement().setAttribute("name", "j_username");
		getView().getPassword().getElement()
				.setAttribute("placeholder", "Password");
		getView().getPassword().getElement().setAttribute("name", "j_password");
		getView().getForm().setAction("LoginValidationServlet");
		getView().getForm().setMethod(FormPanel.METHOD_POST);
		getView().getSubmit().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// RequestBuilder builder = new RequestBuilder(
				// RequestBuilder.POST, "LoginValidationServlet");
				//
				// try {
				// builder.setHeader("Content-Type",
				// "application/x-www-form-urlencoded");
				// Request response = builder.sendRequest(
				// "j_username=" + getView().getUsername().getText()
				// + "&" + "j_password="
				// + getView().getPassword().getText(),
				// new RequestCallback() {
				//
				// public void onError(Request request,
				// Throwable exception) {
				// }
				//
				// public void onResponseReceived(Request request,
				// Response response) {
				// Window.alert("" + response.getText());
				// Window.Location.assign("#home");
				// }
				// });
				// } catch (RequestException e) {
				// Window.alert("Failed to send the request: "
				// + e.getMessage());
				// }
			}
		});
		getView().getForm().addSubmitHandler(new SubmitHandler() {

			@Override
			public void onSubmit(SubmitEvent event) {
				// Window.alert("VALIDATION");
				String username = getView().getUsername().getText();
				String password = getView().getPassword().getText();
				Boolean error = false;

				if (!username.matches("^[a-zA-Z0-9_]+$")) {
					getView().getUsernameError().setVisible(true);
					getView().getUsernameError().setText(
							messages.loginEnterUsername());
					error = true;
					getView().getUsername().setStyleName(cssResources.INSTANCE.Login().loginTextBoxError());
				}
				if (password.trim().equals("") || password.trim().length() == 0) {
					getView().getPasswordError().setVisible(true);
					getView().getPasswordError().setText(
							messages.loginEnterPassword());
					getView().getPassword().setStyleName(cssResources.INSTANCE.Login().loginTextBoxError());
					error = true;
				}

				if (error) {
					event.cancel();
				}

			}
		});

		// DOM.getElementById("loginContainer").set

		getView().getForm().addSubmitCompleteHandler(
				new FormPanel.SubmitCompleteHandler() {
					public void onSubmitComplete(SubmitCompleteEvent event) {
						// When the form submission is successfully completed,
						// this event is
						// fired. Assuming the service returned a response of
						// type text/html,
						// we can get the result text here (see the FormPanel
						// documentation for
						// further explanation). Window.alert("BEFORE RESULT");
						// Window.alert(event.getResults());
						// Window.alert("AFTER RESULT");
						Window.Location.assign("#home");
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
