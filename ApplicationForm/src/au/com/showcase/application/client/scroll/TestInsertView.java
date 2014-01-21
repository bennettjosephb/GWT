package au.com.showcase.application.client.scroll;

import au.com.showcase.application.client.bundle.DecoratedPopupPanel;
import au.com.showcase.application.client.ui.event.TextBoxBlurHandler;
import au.com.showcase.application.client.ui.event.TextBoxClickHandler;
import au.com.showcase.application.client.ui.event.TextBoxFocusAndBlurHandler;
import au.com.showcase.application.client.ui.event.TextBoxFocusHandler;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class TestInsertView extends ViewImpl implements
		TestInsertPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TestInsertView> {
	}

	// @UiField
	// InputElement firstName;

	TextBox firstName;

	// @UiField
	FormPanel formPanel1;

	public FormPanel getFormPanel1() {
		return formPanel1;
	}

	public void setFormPanel1(FormPanel formPanel1) {
		this.formPanel1 = formPanel1;
	}

	public HTMLPanel getContainerPanel1() {
		return containerPanel1;
	}

	public void setContainerPanel1(HTMLPanel containerPanel1) {
		this.containerPanel1 = containerPanel1;
	}

	@UiField
	HTMLPanel containerPanel1;

	public TextBox getFirstName() {
		return firstName;
	}

	public void setFirstName(TextBox firstName) {
		this.firstName = firstName;
	}

	@Inject
	public TestInsertView(final Binder binder) {

		widget = binder.createAndBindUi(this);
	}

	DecoratedPopupPanel decoratedPopupPanelFirstName;

	DecoratedPopupPanel decoratedPopupPanelLastName;

	TextBoxClickHandler firstNameClickHandler = new TextBoxClickHandler();
	TextBoxClickHandler lastNameClickHandler = new TextBoxClickHandler();
	TextBoxBlurHandler firstNameBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler firstNameFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler lastNameBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler lastNameFocusHandler = new TextBoxFocusHandler();

	@UiField
	RegistrationForm registrationForm;

	public RegistrationForm getRegistrationForm() {
		return registrationForm;
	}

	public void setRegistrationForm(RegistrationForm registrationForm) {
		this.registrationForm = registrationForm;
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
