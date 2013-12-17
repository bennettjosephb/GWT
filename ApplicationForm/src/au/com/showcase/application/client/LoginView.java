package au.com.showcase.application.client;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class LoginView extends ViewImpl implements LoginPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, LoginView> {
	}

	String name;

	@UiField
	TextBox username;

	public TextBox getUsername() {
		return username;
	}

	public void setUsername(TextBox username) {
		this.username = username;
	}

	public Label getUsernameError() {
		return usernameError;
	}

	public void setUsernameError(Label usernameError) {
		this.usernameError = usernameError;
	}

	public PasswordTextBox getPassword() {
		return password;
	}

	public void setPassword(PasswordTextBox password) {
		this.password = password;
	}

	public Label getPasswordError() {
		return passwordError;
	}

	public void setPasswordError(Label passwordError) {
		this.passwordError = passwordError;
	}

	@UiField
	Label usernameError;

	@UiField
	PasswordTextBox password;

	@UiField
	Label passwordError;

	@UiField
	SubmitButton submit;

	@UiField
	FormPanel form;

	public FormPanel getForm() {
		return form;
	}

	public void setForm(FormPanel form) {
		this.form = form;
	}

	public SubmitButton getSubmit() {
		return submit;
	}

	public void setSubmit(SubmitButton submit) {
		this.submit = submit;
	}

	@Inject
	public LoginView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
